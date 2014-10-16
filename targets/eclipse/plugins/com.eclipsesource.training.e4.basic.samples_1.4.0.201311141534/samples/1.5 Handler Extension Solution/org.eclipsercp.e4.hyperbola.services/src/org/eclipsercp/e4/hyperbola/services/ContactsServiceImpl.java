package org.eclipsercp.e4.hyperbola.services;

import org.eclipsercp.e4.hyperbola.model.ContactGroup;
import org.eclipsercp.e4.hyperbola.model.ContactService;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;

public class ContactsServiceImpl implements ContactService{

	@Override
	public ContactGroup getRootGroup() {
		return ModelFactory.eINSTANCE.createExampleModel();
	}
	
}
