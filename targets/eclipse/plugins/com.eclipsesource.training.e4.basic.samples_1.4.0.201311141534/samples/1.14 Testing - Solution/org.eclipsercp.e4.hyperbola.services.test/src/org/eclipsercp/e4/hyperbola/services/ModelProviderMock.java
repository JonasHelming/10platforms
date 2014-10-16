package org.eclipsercp.e4.hyperbola.services;

import org.eclipsercp.e4.hyperbola.model.Contact;
import org.eclipsercp.e4.hyperbola.model.ContactGroup;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;
import org.eclipsercp.e4.hyperbola.model.ModelProvider;

public class ModelProviderMock implements ModelProvider {


	public ModelProviderMock() {
		// Add two toplevel groups
		root = ModelFactory.eINSTANCE.createContactGroup();
		firstTopLevel = ModelFactory.eINSTANCE.createContactGroup();
		firstTopLevel.setName("FirstTopLevel");
		secondTopLevel = ModelFactory.eINSTANCE.createContactGroup();
		secondTopLevel.setName("SecondTopLevel");
		emptyTopLevel = ModelFactory.eINSTANCE
				.createContactGroup();
		root.getContacts().add(secondTopLevel);
		root.getContacts().add(firstTopLevel);
		root.getContacts().add(emptyTopLevel);

		inFirstGroup = ModelFactory.eINSTANCE.createContact();
		inFirstGroup.setName("InFirstGroup");
		firstTopLevel.getContacts().add(inFirstGroup);
		inSecondGroup = ModelFactory.eINSTANCE.createContact();
		inSecondGroup.setName("Bob");
		secondTopLevel.getContacts().add(inSecondGroup);

		subgroup = ModelFactory.eINSTANCE.createContactGroup();
		firstTopLevel.getContacts().add(subgroup);
		subContact = ModelFactory.eINSTANCE.createContact();
		subgroup.getContacts().add(subContact);
		subContactSameName = ModelFactory.eINSTANCE.createContact();
		subContactSameName.setName("InFirstGroup");
		subgroup.getContacts().add(subContact);

	}

	public Contact subContactSameName;
	public ContactGroup root;
	public ContactGroup firstTopLevel;
	public ContactGroup secondTopLevel;
	public Contact inFirstGroup;
	public Contact inSecondGroup;
	public ContactGroup subgroup;
	public Contact subContact;
	public ContactGroup emptyTopLevel;

	@Override
	public ContactGroup getRootGroup() {

		return root;
	}

}
