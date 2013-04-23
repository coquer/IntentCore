package itu.dk.aamj.intentdsl.ui.views;

import intent.Intent;
import itu.dk.aamj.intentdsl.classes.IntentHandler;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class MainView extends ViewPart {
	
	public static final String ID = "itu.dk.aamj.intentdsl.ui.views.MainView";

	private TableViewer viewer;
	private Action InsertAction;
	private IntentHandler intentHandler;
	private boolean handleExceptions = false;
	private IntentFilter filter;
	private Text searchText;
	
	public MainView() {
		
		super();

		intentHandler = new IntentHandler();
		intentHandler.getModel();
		
	}
	
	@Override
	public void createPartControl(Composite parent) {
		
		GridLayout layout = new GridLayout(2, false);
	    parent.setLayout(layout);

	    searchText = new Text(parent, SWT.BORDER | SWT.SEARCH);
	    searchText.setMessage("Type to search");
	    searchText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL| GridData.HORIZONTAL_ALIGN_FILL));
	    
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);
		viewer.setInput(intentHandler.getModel().getIntents());
		viewer.setComparator(new ViewerComparator() {
			public int compare(Viewer viewer, Object e1, Object e2) {
				return ((Intent) e1).getName().compareToIgnoreCase(((Intent) e2).getName());
			}
		});
		
		{
			TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
			TableColumn column = viewerColumn.getColumn();
			column.setText("Name");
			column.setWidth(300);
			column.setResizable(true);
			viewerColumn.setLabelProvider(new ColumnLabelProvider() {
				@Override
				public String getText(Object element) {
					Intent intent = (Intent) element;
					return intent.getName();
				}
			});
		}
		
		{
			TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
			TableColumn column = viewerColumn.getColumn();
			column.setText("Action");
			column.setResizable(true);
			column.setWidth(300);
			viewerColumn.setLabelProvider(new ColumnLabelProvider() {
				@Override
				public String getText(Object element) {
					Intent intent = (Intent) element;
					return intent.getAction();
				}
			});
		}
		
//		http://www.vogella.com/articles/EclipseJFaceTableAdvanced/article.html
		filter = new IntentFilter();
		searchText.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent ke) {
				filter.setSearchText(searchText.getText());
				viewer.refresh();
			}
		});
		viewer.addFilter(filter);
		
		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "itu.dk.aamj.intentdsl.ui.viewer");
		makeActions();
		
		/**
		 * set the context menu right click up and add the actions
		 */
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
		
	    GridData gridData = new GridData();
	    gridData.verticalAlignment = GridData.FILL;
	    gridData.horizontalSpan = 2;
	    gridData.grabExcessHorizontalSpace = true;
	    gridData.grabExcessVerticalSpace = true;
	    gridData.horizontalAlignment = GridData.FILL;
	    viewer.getControl().setLayoutData(gridData);
	}
	
	public class IntentFilter extends ViewerFilter {

		private String searchString;

		public void setSearchText(String s) {
			this.searchString = "(.*)(?i)(" + s + ")(.*)";
		}

		@Override
		public boolean select(Viewer viewer,  Object parentElement,  Object element) {
			
			if (searchString == null || searchString.length() == 0)
				return true;
			
			Intent intent = (Intent) element;
			if (intent.getName().matches(searchString) || intent.getAction().matches(searchString))
				return true;

			return false;
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
	
	private void makeActions() {

		InsertAction = new Action() {
			public void run() {
				
				ISelection selection = viewer.getSelection();
				if(selection == null)
					return;
				
				Object obj = ((IStructuredSelection)selection).getFirstElement();

				try {

					int result = intentHandler.InsertIntent((Intent) obj, handleExceptions);

					// Add more error checking here
					if(result == -1) {
						
						showMessage("Please ensure you have an editor window open.");
						
					} else if(result == -2) {

						showMessage("/AndroidManifest.xml missing or incorrectly formatted.");

					} else if(result == 0) {

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
