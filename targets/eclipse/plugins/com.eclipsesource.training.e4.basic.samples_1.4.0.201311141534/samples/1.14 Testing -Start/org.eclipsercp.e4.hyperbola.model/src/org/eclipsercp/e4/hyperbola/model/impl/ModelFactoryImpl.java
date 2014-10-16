/**
 */
package org.eclipsercp.e4.hyperbola.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipsercp.e4.hyperbola.model.Contact;
import org.eclipsercp.e4.hyperbola.model.ContactGroup;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;
import org.eclipsercp.e4.hyperbola.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/eclipsercp/e4/hyperbola"); 
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.CONTACT: return createContact();
			case ModelPackage.CONTACT_GROUP: return createContactGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactGroup createContactGroup() {
		ContactGroupImpl contactGroup = new ContactGroupImpl();
		return contactGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}
	
	@Override
	public ContactGroup createExampleModel() {
		ContactGroup root = ModelFactory.eINSTANCE.createContactGroup();
		ContactGroup firstTopLevel = ModelFactory.eINSTANCE.createContactGroup();
		firstTopLevel.setName("FirstTopLevel");
		ContactGroup secondTopLevel = ModelFactory.eINSTANCE.createContactGroup();
		secondTopLevel.setName("SecondTopLevel");
		ContactGroup emptyTopLevel = ModelFactory.eINSTANCE
				.createContactGroup();
		root.getContacts().add(secondTopLevel);
		root.getContacts().add(firstTopLevel);
		root.getContacts().add(emptyTopLevel);

		// Add one contact in each top level group
		Contact inFirstGroup = ModelFactory.eINSTANCE.createContact();
		inFirstGroup.setName("InFirstGroup");
		firstTopLevel.getContacts().add(inFirstGroup);
		Contact inSecondGroup = ModelFactory.eINSTANCE.createContact();
		inSecondGroup.setName("Bob");
		secondTopLevel.getContacts().add(inSecondGroup);

		ContactGroup subgroup = ModelFactory.eINSTANCE.createContactGroup();
		firstTopLevel.getContacts().add(subgroup);
		Contact subContact = ModelFactory.eINSTANCE.createContact();
		subgroup.getContacts().add(subContact);



		return root;
	}

} //ModelFactoryImpl