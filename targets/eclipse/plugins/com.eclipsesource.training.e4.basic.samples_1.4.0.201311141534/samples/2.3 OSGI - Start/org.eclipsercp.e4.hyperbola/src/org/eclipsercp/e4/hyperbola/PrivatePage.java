package org.eclipsercp.e4.hyperbola;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipsercp.e4.hyperbola.model.Contact;
import org.eclipsercp.e4.hyperbola.model.ModelPackage;

public class PrivatePage extends WizardPage implements IWizardPage {

	private Contact createContact;
	private DataBindingContext context;

	public PrivatePage(Contact createContact, DataBindingContext context) {
		super("namePage");
		this.createContact = createContact;
		super.setMessage("Is it a private Contact?");
		this.context = context;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout (2, false);
		composite.setLayout (gridLayout);

		Label label = new Label (composite, SWT.NONE);
		label.setText ("Private Contact?:");
		
		Button button = new Button(composite, SWT.CHECK);
		GridData data = new GridData (SWT.FILL, SWT.CENTER, true, false);
		button.setLayoutData (data);
		
		IObservableValue observeValue = EMFObservables.observeValue(createContact, ModelPackage.eINSTANCE.getContact_PrivateContact());
		ISWTObservableValue observeSelection = SWTObservables.observeSelection(button);
		
		context.bindValue(observeSelection, observeValue);
		
		setControl(composite);


	}

}
