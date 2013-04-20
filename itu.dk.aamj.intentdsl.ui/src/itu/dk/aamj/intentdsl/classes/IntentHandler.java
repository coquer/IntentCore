package itu.dk.aamj.intentdsl.classes;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.framework.Bundle;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import com.google.inject.Injector;

import intent.Callback;
import intent.Extra;
import intent.Intent;
import intent.IntentPackage;
import intent.Model;
import itu.dk.aamj.intentdsl.IntentDslStandaloneSetup;

public class IntentHandler {
	
	private Model model;
	
	public void getModel() {
		
//		IntentPackage.eINSTANCE.getClass();
		// http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
//		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new IntentDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//		Resource resource = resourceSet.getResource(
//		    URI.createURI("/gen/i.intentdsl"), true);
		
		Bundle bundle = Platform.getBundle("itu.dk.aamj.intentdsl.ui");
		URL fileURL = bundle.getEntry("gen/i.intentdsl");

		Resource resource = resourceSet.getResource(
				URI.createURI(fileURL.toString()), true);
		
		model = (Model) resource.getContents().get(0);
		
	}
	
	/**
	 * Copy intent code to the Clipboard 
	 * @param intentActionName
	 * @return
	 * @throws Exception
	 */
	public void CopyIntent(String intentActionName) throws Exception {
		
		// Get the source
//		String source = getSource(intentActionName);
		String source = "";
		
		// Add to clipboard
		Display display = Display.getCurrent();
        Clipboard clipboard = new Clipboard(display);
        clipboard.setContents(new Object[] { source }, new Transfer[] { TextTransfer.getInstance() });
        clipboard.dispose();
		
	}
	
	public ArrayList<String> getIntentNameArray() {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		for(Intent i : model.getIntents()) {
			
			obj.add(i.getName());
			
		}
		
		return obj;
	}
	
	private Intent findIntentByName(String intentName) {
		
		for(Intent intent : model.getIntents()) {
			
			if(intent.getName() == intentName)
				return intent;
			
		}
		
		return null;
		
	}
	
	public int InsertIntent(String intentName) throws Exception {
		
		//Get the intent
		Intent intent = findIntentByName(intentName);
		if(intent == null)
			throw new Exception("ERROR! INTENT 404 - NOT FOUND");
		
		// Get the current editor window, and the input 
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorPart editor = page.getActiveEditor();
		IEditorInput input = editor.getEditorInput();
		
		ICompilationUnit compilationUnit = (ICompilationUnit) JavaUI.getEditorInputJavaElement(editor.getEditorInput());
		
		// Ensure the editor is open
		if(!(compilationUnit instanceof ICompilationUnit)) {
			return -1;
		}

		ITextEditor texteditor = (ITextEditor) editor;
		IDocument document = texteditor.getDocumentProvider().getDocument(input);
		ISelection selection = texteditor.getSelectionProvider().getSelection();

		//Parse as AST
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(compilationUnit);
		parser.setResolveBindings(true);
		CompilationUnit astRoot = (CompilationUnit) parser.createAST(null);
		astRoot.recordModifications();
		AST ast = astRoot.getAST();
		
		//Get the cursor position
		int cursorOffset = ((ITextSelection) selection).getOffset();

		//Find the method we're in
		MethodDeclaration method = findMethod(cursorOffset, astRoot);
		if(method == null) {
			//Not inside a method, return 0 and warn user
			return 0;
		}

		//find current position inside method
		int index = findIndexInMethod(method, cursorOffset);
		List<Statement> statementsList = method.getBody().statements();
		
		
		//Create the class call
		//TODO We should change this for every intent
		String instanceNameString = "i"; // Note that using a string here isntead of newSimpleName is important as it gets overridden for some reason
		VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();  
		vdf.setName(ast.newSimpleName(instanceNameString));  
		ClassInstanceCreation cc = ast.newClassInstanceCreation();  
		cc.setType(ast.newSimpleType(ast.newSimpleName("Intent")));
		
		// Add the action name as a parameters
		StringLiteral actionStringName = ast.newStringLiteral();
		actionStringName.setLiteralValue(intent.getAction());
		cc.arguments().add(actionStringName);
		
		vdf.setInitializer(cc);
		VariableDeclarationStatement vds = ast.newVariableDeclarationStatement(vdf);  
		vds.setType(ast.newSimpleType(ast.newSimpleName("Intent")));
				
		//Add this call
		statementsList.add(++index, vds);
		
		SimpleName instanceName = ast.newSimpleName(instanceNameString);
		
		// i.setType( value )
		String intentType = intent.getType();
		if(intentType != null) {

			StringLiteral data = ast.newStringLiteral();
			data.setLiteralValue(intentType);
			
			MethodInvocation methodInv = ast.newMethodInvocation();
			methodInv.setExpression(instanceName);
			methodInv.setName(ast.newSimpleName("setType"));
			methodInv.arguments().add(data);
			
			statementsList.add(++index, ast.newExpressionStatement(methodInv));
			
		}
		
		// i.setData(Uri.parse( value ));
		String intentData = intent.getData();
		if(intentData != null) {
			
			StringLiteral data = ast.newStringLiteral();
			data.setLiteralValue(intentData);
			
			MethodInvocation uriInv = ast.newMethodInvocation();
			uriInv.setExpression(ast.newName("Uri"));
			uriInv.setName(ast.newSimpleName("parse"));
			uriInv.arguments().add(data);
			
			MethodInvocation dataInv = ast.newMethodInvocation();
			dataInv.setExpression(instanceName);
			dataInv.setName(ast.newSimpleName("setData"));
			dataInv.arguments().add(uriInv);
			
			statementsList.add(++index, ast.newExpressionStatement(dataInv));
			
		}
		
		for(Extra extra : intent.getExtras()) {
			
//			SingleVariableDeclaration variableDeclaration = ast.newSingleVariableDeclaration();
//			variableDeclaration.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName(extra.getType()))));
//			variableDeclaration.setName(ast.newSimpleName(extra.getName()));
			
			//TODO Why does this need to go here twice!?????
			instanceName = ast.newSimpleName(instanceNameString);
			
			StringLiteral value = ast.newStringLiteral();
			value.setLiteralValue(extra.getValue());
			
			StringLiteral data = ast.newStringLiteral();
			data.setLiteralValue(extra.getName());
			
			MethodInvocation methodInv = ast.newMethodInvocation();
			methodInv.setExpression(instanceName);
			methodInv.setName(ast.newSimpleName("putExtra"));
			methodInv.arguments().add(data);
			methodInv.arguments().add(value);
			
			statementsList.add(++index, ast.newExpressionStatement(methodInv));
			
		}
		
		//TODO Again WHY?! It won't work if you take this out
		instanceName = ast.newSimpleName(instanceNameString);
		
		//Start the intent
		//TODO We need a Broadcast intent that will use "sendBroadcast"
		Callback callback = intent.getSucessCallback();
		if(callback != null) {
			
			//TODO Again WHY?! It won't work if you take this out
			MethodInvocation startAct = ast.newMethodInvocation();
			startAct.setName(ast.newSimpleName("startActivityForResult"));
			startAct.arguments().add(instanceName);
			startAct.arguments().add(ast.newSimpleName(callback.getName()));
			statementsList.add(++index, ast.newExpressionStatement(startAct));
			
			//Find the method onActivityResult
//			MethodDeclaration methodDecl = null;
//			
//			List<BodyDeclaration> decls = ((TypeDeclaration)astRoot.types().get(0)).bodyDeclarations();
//			
//			astRoot.
//					
//			for (Iterator<BodyDeclaration> iterator = decls.iterator(); iterator.hasNext();){
//				
//				BodyDeclaration decl = (BodyDeclaration) iterator.next();
//				System.out.println(decl.getE);
//				if((decl instanceof MethodDeclaration)) {
//				}
//				
//			}
			
			//Method not found, create it
			
			//Add to the method
			
//		     protected void onActivityResult(int requestCode, int resultCode,
//		             Intent data) {
//		         if (requestCode == PICK_CONTACT_REQUEST) {
//		             if (resultCode == RESULT_OK) {
//		                 // A contact was picked.  Here we will just display it
//		                 // to the user.
//		                 startActivity(new Intent(Intent.ACTION_VIEW, data));
//		             }
//		         }
//		     }
			
		}
		else {
			
			MethodInvocation startAct = ast.newMethodInvocation();
			startAct.setName(ast.newSimpleName("startActivity"));
			startAct.arguments().add(instanceName);
			statementsList.add(++index, ast.newExpressionStatement(startAct));
			
		}
			

		//Rewrite the AST
		TextEdit edits = astRoot.rewrite(document, compilationUnit.getJavaProject().getOptions(true));
		compilationUnit.applyTextEdit(edits, null);

		compilationUnit.getBuffer().setContents(document.get());

		// Success
		return 1;

	}
	
	/**
	 * Find the method which the cursor is currently in
	 * @param offset
	 * @param astRoot
	 * @return MethodDeclaration
	 */
	private MethodDeclaration findMethod(int offset, CompilationUnit astRoot) {
		
		MethodDeclaration methodDecl = null;

		List<BodyDeclaration> decls = ((TypeDeclaration)astRoot.types().get(0)).bodyDeclarations();
		
		for (Iterator<BodyDeclaration> iterator = decls.iterator(); iterator.hasNext();){
			
			BodyDeclaration decl = (BodyDeclaration) iterator.next();
			if(decl instanceof MethodDeclaration) {
				
				methodDecl = (MethodDeclaration) decl;
				int startRange = methodDecl.getBody().getStartPosition();
				int endRange = methodDecl.getBody().getStartPosition() + methodDecl.getBody().getLength();
				
				if(offset >= startRange && offset <= endRange)
					return methodDecl;
				
			}
			
		}
		
		return methodDecl;
		
	}

	/**
	 * TODO This doesn't work as it should
	 * 
	 * Return the current statement inside a method, which the cursor currently has focus
	 * @param method
	 * @param offset
	 * @return int
	 */
	private int findIndexInMethod(MethodDeclaration method, int offset){

		List<Statement> statements = method.getBody().statements();
		
		if(statements.size() == 0)
			return 0;
		
		for(int i = 0; i < statements.size(); i++){
			
			Statement statement = (Statement) statements.get(i);
			int startRange = statement.getStartPosition();
			int endRange = statement.getStartPosition() + statement.getLength();
			
			//Is cursor at the start of the method?
			if(offset <= startRange && i == 0)
				return 0;
			
			// Is cursor inside current statement
			//TODO This needs checking as it sometimes fails
			if(offset >= startRange && offset <= endRange)
				return i;
			
		}

		// Insert at end
		return statements.size();
	}

}
