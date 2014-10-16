package org.example.helloworld;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class HelloWorldView {
	
	@Inject
	public HelloWorldView(Composite parent){
		Label label = new Label(parent, SWT.NONE);
		label.setText("Hello World");
	}

}
