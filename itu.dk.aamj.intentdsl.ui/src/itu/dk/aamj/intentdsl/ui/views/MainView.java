package itu.dk.aamj.intentdsl.ui.views;

import java.net.URL;
import java.util.ArrayList;

import intent.Model;
import itu.dk.aamj.intentdsl.IntentDslStandaloneSetup;
import itu.dk.aamj.intentdsl.classes.IntentHandler;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.StringArrayConverter;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.internal.dialogs.ViewContentProvider;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.framework.Bundle;

import org.eclipse.ui.part.*;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;

import com.google.inject.Injector;

public class MainView extends ViewPart {
	
	public static final String ID = "itu.dk.aamj.intentdsl.ui.views.MainView";

	private TableViewer viewer;
	private Action InsertAction;
	private Action CopyAction;
	private IntentHandler intentHandler;
	private boolean handleExceptions = false;
	
	public MainView() {
		
		super();

		intentHandler = new IntentHandler();
		intentHandler.getModel();
		
	}
	
	@Override
	public void createPartControl(Composite parent) {

		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
//		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());
		
		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "itu.dk.aamj.intentdsl.ui.viewer");
		makeActions();
		
		/**
		 * set the context menu right click up and add the actions
		 */
		hookContextMenu();
		contributeToActionBars();

		/**
		 * add event listener for double click
		 */
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				
				InsertAction.run();
				
			}
		});
		
	}
	
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		
		public Object[] getElements(Object parent) {
			
			return intentHandler.getIntentNameArray().toArray();
			
		}
		
	}
	
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().
					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}
	
	private void contributeToActionBars() {
	    
		Action exceptionButton = new Action("Enable Exception Handling", IAction.AS_CHECK_BOX) { 
			public void run() {    
				handleExceptions = !handleExceptions;
			}    
		};
		getViewSite().getActionBars().getToolBarManager().add(exceptionButton);
	    
	}
	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				MainView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void fillContextMenu(IMenuManager manager) {
		
		if (viewer.getSelection().isEmpty())
			return;
		
		manager.add(CopyAction);
		
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		
	}

	private void makeActions() {

		CopyAction = new Action() {
			public void run() {
				
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();

				try {

					intentHandler.CopyIntent(obj.toString().replace(".", "_"));

				} catch (Exception e) {

					e.printStackTrace();
					showMessage("ERROR: " + e);
				}

			}
		};
		CopyAction.setText("Copy");
		CopyAction.setToolTipText("Copy selected Intent snippet to clipboard");
		CopyAction.setImageDescriptor(
				PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK)
				);

		InsertAction = new Action() {
			public void run() {
				
				ISelection selection = viewer.getSelection();
				if(selection == null)
					return;
				
				Object obj = ((IStructuredSelection)selection).getFirstElement();

				try {

					System.out.println(obj.toString());
					int result = intentHandler.InsertIntent(obj.toString(), handleExceptions);

					// Add more error checking here
					if(result == -1) {
						
						showMessage("Please ensure you have an editor window open.");
						
					} else if(result == 0) {

						// Should we create the method for them?
						showMessage("Please create a method, and position cursor inside method.");

					}
					// else if (result == 1) { showMessage("You owe me a beer"); } //Success

				} catch (Exception e) {

					e.printStackTrace();
					showMessage("This is log " + e);
				}

			}
		};
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(
				viewer.getControl().getShell(),
				"Main View",
				message
				);
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	

}
