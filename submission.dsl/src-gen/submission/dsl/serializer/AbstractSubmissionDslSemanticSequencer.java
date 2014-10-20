package submission.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import submission.Submission;
import submission.SubmissionPackage;
import submission.dsl.services.SubmissionDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractSubmissionDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SubmissionDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SubmissionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SubmissionPackage.SUBMISSION:
				if(context == grammarAccess.getSubmissionRule()) {
					sequence_Submission(context, (Submission) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString eMail=EString? answer=Answer?)
	 */
	protected void sequence_Submission(EObject context, Submission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
