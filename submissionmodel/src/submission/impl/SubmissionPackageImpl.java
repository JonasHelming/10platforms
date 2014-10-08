/**
 */
package submission.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import submission.Answer;
import submission.Submission;
import submission.SubmissionFactory;
import submission.SubmissionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubmissionPackageImpl extends EPackageImpl implements SubmissionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum answerEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see submission.SubmissionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubmissionPackageImpl() {
		super(eNS_URI, SubmissionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SubmissionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubmissionPackage init() {
		if (isInited) return (SubmissionPackage)EPackage.Registry.INSTANCE.getEPackage(SubmissionPackage.eNS_URI);

		// Obtain or create and register package
		SubmissionPackageImpl theSubmissionPackage = (SubmissionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SubmissionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SubmissionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSubmissionPackage.createPackageContents();

		// Initialize created meta-data
		theSubmissionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubmissionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubmissionPackage.eNS_URI, theSubmissionPackage);
		return theSubmissionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmission() {
		return submissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmission_Name() {
		return (EAttribute)submissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmission_EMail() {
		return (EAttribute)submissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmission_Answer() {
		return (EAttribute)submissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnswer() {
		return answerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmissionFactory getSubmissionFactory() {
		return (SubmissionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		submissionEClass = createEClass(SUBMISSION);
		createEAttribute(submissionEClass, SUBMISSION__NAME);
		createEAttribute(submissionEClass, SUBMISSION__EMAIL);
		createEAttribute(submissionEClass, SUBMISSION__ANSWER);

		// Create enums
		answerEEnum = createEEnum(ANSWER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(submissionEClass, Submission.class, "Submission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Submission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmission_EMail(), ecorePackage.getEString(), "eMail", null, 0, 1, Submission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmission_Answer(), this.getAnswer(), "answer", null, 0, 1, Submission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(answerEEnum, Answer.class, "Answer");
		addEEnumLiteral(answerEEnum, Answer.A);
		addEEnumLiteral(answerEEnum, Answer.B);

		// Create resource
		createResource(eNS_URI);
	}

} //SubmissionPackageImpl
