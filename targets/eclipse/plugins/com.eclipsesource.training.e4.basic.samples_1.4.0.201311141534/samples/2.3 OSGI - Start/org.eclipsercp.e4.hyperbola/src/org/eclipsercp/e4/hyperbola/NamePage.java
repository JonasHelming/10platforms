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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipsercp.e4.hyperbola.model.Contact;
import org.eclipsercp.e4.hyperbola.model.ModelPackage;

public class NamePage extends WizardPage implements IWizardPage {

	private Contact createContact;
	private DataBindingContext context;

	public NamePage(Contact createContact, DataBindingContext context) {
		super("namePage");
		super.setMessage("Enter a Name");
		this.createContact = createContact;
		this.context = context;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout (2, false);
		composite.setLayout (gridLayout);

		Label label0 = new Label (composite, SWT.NONE);
		label0.setText ("Name:");
		
		Text text1 = new Text (composite, SWT.BORDER);
		GridData data = new GridData (SWT.FILL, SWT.CENTER, true, false);
		text1.setLayoutData (data);
		
		IObservableValue observeValue = EMFObservables.observeValue(createContact, ModelPackage.eINSTANCE.getContactEntry_Name());
		ISWTObservableValue obrserveText = SWTObservables.observeText(text1, SWT.Modify);
			
		context.bindValue(obrserveText, observeValue);
		
		setControl(composite);

	}

}
