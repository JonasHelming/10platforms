package org.eclipsercp.e4.hyperbola;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipsercp.e4.hyperbola.model.ContactEntry;

public class DetailsView {
	
	private Label label;

	public DetailsView(Composite parent){
		label = new Label(parent, SWT.NONE);
	}
	
	public void setInput(ContactEntry contactEntry){
		if(contactEntry.getName()==null){
			label.setText("");
		}
		else{
			label.setText(contactEntry.getName());
		}
	}
	

}
