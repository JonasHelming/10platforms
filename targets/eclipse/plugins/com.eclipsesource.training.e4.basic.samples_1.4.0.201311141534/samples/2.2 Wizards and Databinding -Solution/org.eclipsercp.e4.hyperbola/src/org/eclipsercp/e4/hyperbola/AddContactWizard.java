package org.eclipsercp.e4.hyperbola;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipsercp.e4.hyperbola.model.Contact;
import org.eclipsercp.e4.hyperbola.model.ContactGroup;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;

public class AddContactWizard extends Wizard implements IWizard {

	private Contact createContact;
	private DataBindingContext context;
	private ContactGroup contactGroup;

	public AddContactWizard(ContactGroup createContactGroup) {
		this.contactGroup = createContactGroup;
		createContact = ModelFactory.eINSTANCE.createContact();
		context = new DataBindingContext();	
	}
	
	

	@Override
	public void addPages() {
		addPage(new NamePage(createContact,context));
		addPage(new PrivatePage(createContact, context));
	}



	@Override
	public boolean performFinish() {
		contactGroup.getContacts().add(createContact);
		return true;
	}

}
