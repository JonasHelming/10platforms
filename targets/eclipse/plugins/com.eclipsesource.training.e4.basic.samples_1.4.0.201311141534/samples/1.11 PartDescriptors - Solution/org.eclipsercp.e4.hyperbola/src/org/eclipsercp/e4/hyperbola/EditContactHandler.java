 
package org.eclipsercp.e4.hyperbola;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipsercp.e4.hyperbola.model.Contact;


public class EditContactHandler {
	@Inject
	EPartService partService;
	
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) Contact entry) {
		MPart part = partService.showPart("org.eclipsercp.e4.hyperbola.editorpartdescriptor", PartState.ACTIVATE);
		part.getContext().set(Contact.class, entry);
	}
	
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) Contact entry) {
		return entry!=null;
	}
		
}