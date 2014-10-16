package org.eclipsercp.e4.hyperbola.extensions;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipsercp.e4.hyperbola.model.Contact;

public class RemoveContactHandler {

	@Execute
	public void removeContact(@Named(IServiceConstants.ACTIVE_SELECTION) Contact contact) {
		EcoreUtil.delete(contact);
	}
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection){
		if(selection!=null && selection instanceof Contact){
			return true;
		}
		return false;
	}
	
}
