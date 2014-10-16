package org.eclipsercp.e4.hyperbola;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipsercp.e4.hyperbola.model.ContactGroup;

public class AddContactHandler {

	@Execute
	public void createContact(
			@Named(IServiceConstants.ACTIVE_SELECTION) ContactGroup createContactGroup,
			Shell shell) {
		WizardDialog wizardDialog = new WizardDialog(shell,
				new AddContactWizard(createContactGroup));
		wizardDialog.open();
	}

	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
		if (selection != null && selection instanceof ContactGroup) {
			return true;
		}
		return false;
	}

}
