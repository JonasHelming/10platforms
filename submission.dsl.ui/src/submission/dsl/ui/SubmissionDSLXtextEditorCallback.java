package submission.dsl.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.builder.nature.NatureAddingEditorCallback;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

@SuppressWarnings("restriction")
public class SubmissionDSLXtextEditorCallback extends NatureAddingEditorCallback {

	@Override
	public void afterSave(XtextEditor editor) {
		super.afterSave(editor);
		IXtextDocument xtextDocument = editor.getDocument();
		EObject eObject = xtextDocument.readOnly(
				new IUnitOfWork<EObject, XtextResource>(){
					public EObject exec(XtextResource resource) {
						EObject eObject = resource.getContents().get(0);
						return eObject;
					}
				});
		System.out.println(eObject);
	}
	
}