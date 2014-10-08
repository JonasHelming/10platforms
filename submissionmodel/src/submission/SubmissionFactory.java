/**
 */
package submission;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see submission.SubmissionPackage
 * @generated
 */
public interface SubmissionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubmissionFactory eINSTANCE = submission.impl.SubmissionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Submission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submission</em>'.
	 * @generated
	 */
	Submission createSubmission();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SubmissionPackage getSubmissionPackage();

} //SubmissionFactory
