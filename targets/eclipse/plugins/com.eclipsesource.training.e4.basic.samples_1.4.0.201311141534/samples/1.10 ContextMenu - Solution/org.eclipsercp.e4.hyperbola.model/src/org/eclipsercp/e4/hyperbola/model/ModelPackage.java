/**
 */
package org.eclipsercp.e4.hyperbola.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipsercp.e4.hyperbola.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipsercp/e4/hyperbola";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipsercp.e4.hyperbola.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipsercp.e4.hyperbola.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipsercp.e4.hyperbola.model.impl.ContactEntryImpl <em>Contact Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsercp.e4.hyperbola.model.impl.ContactEntryImpl
	 * @see org.eclipsercp.e4.hyperbola.model.impl.ModelPackageImpl#getContactEntry()
	 * @generated
	 */
	int CONTACT_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ENTRY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Contact Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipsercp.e4.hyperbola.model.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsercp.e4.hyperbola.model.impl.ContactImpl
	 * @see org.eclipsercp.e4.hyperbola.model.impl.ModelPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = CONTACT_ENTRY__NAME;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = CONTACT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipsercp.e4.hyperbola.model.impl.ContactGroupImpl <em>Contact Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsercp.e4.hyperbola.model.impl.ContactGroupImpl
	 * @see org.eclipsercp.e4.hyperbola.model.impl.ModelPackageImpl#getContactGroup()
	 * @generated
	 */
	int CONTACT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUP__NAME = CONTACT_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUP__CONTACTS = CONTACT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUP_FEATURE_COUNT = CONTACT_ENTRY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipsercp.e4.hyperbola.model.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.eclipsercp.e4.hyperbola.model.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for class '{@link org.eclipsercp.e4.hyperbola.model.ContactGroup <em>Contact Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Group</em>'.
	 * @see org.eclipsercp.e4.hyperbola.model.ContactGroup
	 * @generated
	 */
	EClass getContactGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipsercp.e4.hyperbola.model.ContactGroup#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see org.eclipsercp.e4.hyperbola.model.ContactGroup#getContacts()
	 * @see #getContactGroup()
	 * @generated
	 */
	EReference getContactGroup_Contacts();

	/**
	 * Returns the meta object for class '{@link org.eclipsercp.e4.hyperbola.model.ContactEntry <em>Contact Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Entry</em>'.
	 * @see org.eclipsercp.e4.hyperbola.model.ContactEntry
	 * @generated
	 */
	EClass getContactEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsercp.e4.hyperbola.model.ContactEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipsercp.e4.hyperbola.model.ContactEntry#getName()
	 * @see #getContactEntry()
	 * @generated
	 */
	EAttribute getContactEntry_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipsercp.e4.hyperbola.model.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsercp.e4.hyperbola.model.impl.ContactImpl
		 * @see org.eclipsercp.e4.hyperbola.model.impl.ModelPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '{@link org.eclipsercp.e4.hyperbola.model.impl.ContactGroupImpl <em>Contact Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsercp.e4.hyperbola.model.impl.ContactGroupImpl
		 * @see org.eclipsercp.e4.hyperbola.model.impl.ModelPackageImpl#getContactGroup()
		 * @generated
		 */
		EClass CONTACT_GROUP = eINSTANCE.getContactGroup();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_GROUP__CONTACTS = eINSTANCE.getContactGroup_Contacts();

		/**
		 * The meta object literal for the '{@link org.eclipsercp.e4.hyperbola.model.impl.ContactEntryImpl <em>Contact Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsercp.e4.hyperbola.model.impl.ContactEntryImpl
		 * @see org.eclipsercp.e4.hyperbola.model.impl.ModelPackageImpl#getContactEntry()
		 * @generated
		 */
		EClass CONTACT_ENTRY = eINSTANCE.getContactEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_ENTRY__NAME = eINSTANCE.getContactEntry_Name();

	}

} //ModelPackage
