package org.eclipsercp.e4.hyperbola.services;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipsercp.e4.hyperbola.model.ContactGroup;
import org.eclipsercp.e4.hyperbola.model.ContactService;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;

public class ContactsServiceImpl implements ContactService {

	

	

	@Override
	public ContactGroup getRootGroup() {
		return ModelFactory.eINSTANCE.createExampleModel();
	}
	
	@Override
	public ContactGroup mergeGroups(ContactGroup target, ContactGroup source){
		if(!target.eContainer().equals(source.eContainer())){
			return null;
		}
		if(!source.getContacts().isEmpty()){
			target.getContacts().addAll(source.getContacts());
			EcoreUtil.delete(source);
		}
		return target;
	}
	

	
	
}
