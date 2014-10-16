package org.eclipsercp.e4.hyperbola.model;

import java.util.Set;

public interface ContactService {

	public ContactGroup getRootGroup();
	
	public Set<Contact> getAllContacts();

	public Contact findDuplicate(Contact contact);


	/**
	 * Merges two groups. All ContactEntries of the source group are moved into the target group. Afterwards the source group is deleted.
	 * If target and source are not on the same level (share the same parent), a {@link IllegalArgumentException} is thrown.
	 * @param target the target group
	 * @param source the source group
	 * @return the target group
	 */
	ContactGroup mergeGroups(ContactGroup target, ContactGroup source);
	
}
