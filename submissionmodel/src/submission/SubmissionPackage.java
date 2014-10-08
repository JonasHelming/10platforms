/**
 */
package submission;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see submission.SubmissionFactory
 * @model kind="package"
 * @generated
 */
public interface SubmissionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "submission";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "myUniqueID";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "submission";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubmissionPackage eINSTANCE = submission.impl.SubmissionPackageImpl.init();

	/**
	 * The meta object id for the '{@link submission.impl.SubmissionImpl <em>Submission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see submission.impl.SubmissionImpl
	 * @see submission.impl.SubmissionPackageImpl#getSubmission()
	 * @generated
	 */
	int SUBMISSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__ANSWER = 2;

	/**
	 * The number of structural features of the '<em>Submission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Submission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link submission.Answer <em>Answer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see submission.Answer
	 * @see submission.impl.SubmissionPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 1;


	/**
	 * Returns the meta object for class '{@link submission.Submission <em>Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submission</em>'.
	 * @see submission.Submission
	 * @generated
	 */
	EClass getSubmission();

	/**
	 * Returns the meta object for the attribute '{@link submission.Submission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see submission.Submission#getName()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_Name();

	/**
	 * Returns the meta object for the attribute '{@link submission.Submission#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see submission.Submission#getEMail()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_EMail();

	/**
	 * Returns the meta object for the attribute '{@link submission.Submission#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see submission.Submission#getAnswer()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_Answer();

	/**
	 * Returns the meta object for enum '{@link submission.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Answer</em>'.
	 * @see submission.Answer
	 * @generated
	 */
	EEnum getAnswer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubmissionFactory getSubmissionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link submission.impl.SubmissionImpl <em>Submission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see submission.impl.SubmissionImpl
		 * @see submission.impl.SubmissionPackageImpl#getSubmission()
		 * @generated
		 */
		EClass SUBMISSION = eINSTANCE.getSubmission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__NAME = eINSTANCE.getSubmission_Name();

		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__EMAIL = eINSTANCE.getSubmission_EMail();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__ANSWER = eINSTANCE.getSubmission_Answer();

		/**
		 * The meta object literal for the '{@link submission.Answer <em>Answer</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see submission.Answer
		 * @see submission.impl.SubmissionPackageImpl#getAnswer()
		 * @generated
		 */
		EEnum ANSWER = eINSTANCE.getAnswer();

	}

} //SubmissionPackage
