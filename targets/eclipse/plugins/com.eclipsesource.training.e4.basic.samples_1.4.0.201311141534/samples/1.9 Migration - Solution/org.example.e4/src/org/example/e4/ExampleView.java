package org.example.e4;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ExampleView {
	private Label label;
	@Inject
	public ExampleView(Composite parent){
		label = new Label(parent, SWT.NONE);
		label.setText("Hello World");		
	}
	
	@Inject
	public void setInput(@Optional @Named(IServiceConstants.ACTIVE_SELECTION)Object input){
		if(input==null){		
			return;
		}
		label.setText(input.toString());
	}
}
