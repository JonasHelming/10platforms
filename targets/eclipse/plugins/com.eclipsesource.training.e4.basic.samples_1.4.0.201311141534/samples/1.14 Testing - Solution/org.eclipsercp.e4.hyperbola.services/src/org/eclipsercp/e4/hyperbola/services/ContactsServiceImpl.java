package org.eclipsercp.e4.hyperbola.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipsercp.e4.hyperbola.model.Contact;
import org.eclipsercp.e4.hyperbola.model.ContactEntry;
import org.eclipsercp.e4.hyperbola.model.ContactGroup;
import org.eclipsercp.e4.hyperbola.model.ContactService;
import org.eclipsercp.e4.hyperbola.model.ModelProvider;

public class ContactsServiceImpl implements ContactService {

	private ModelProvider modelProvider;

	@Inject
	public ContactsServiceImpl(ModelProvider modelProvider) {
		this.modelProvider = modelProvider;
	}

	@Override
	public ContactGroup getRootGroup() {
		return modelProvider.getRootGroup();
	}
	
	@Override
	public ContactGroup mergeGroups(ContactGroup target, ContactGroup source){
		if(!target.eContainer().equals(source.eContainer())){
			throw new IllegalArgumentException("Groups are not on the same level");
		}
		if(!source.getContacts().isEmpty()){
			target.getContacts().addAll(source.getContacts());
		}
		EcoreUtil.delete(source);
		return target;
	}
	

	
	

	public Set<Contact> getAllContacts() {
		Set<Contact> ret = new HashSet<Contact>();
		ret.addAll(getAllContacts(getRootGroup()));

		return ret;

	}

	private List<Contact> getAllContacts(ContactGroup rootGroup) {
		List<Contact> ret = new ArrayList<Contact>();
		EList<ContactEntry> contacts = rootGroup.getContacts();
		for (ContactEntry contactEntry : contacts) {
			if (contactEntry instanceof Contact) {
				ret.add((Contact) contactEntry);
			}
			if (contactEntry instanceof ContactGroup) {
				ret.addAll(getAllContacts(((ContactGroup) contactEntry)));
			}
		}
		return ret;
	}

	@Override
	public Contact findDuplicate(Contact duplicate) {
		Set<Contact> allContacts = getAllContacts();
		for (Contact contact : allContacts) {
			if ((contact.getName() == null)) {
				if (duplicate.getName() == null) {
					return contact;
				}
				continue;
			}
			if (contact.getName().equals(duplicate.getName())) {
				return contact;
			}
		}
		return null;
	}
}
