 
package org.eclipsercp.e4.hyperbola;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipsercp.e4.hyperbola.model.Contact;

public class EditorView {
	
	private Text text;
	
	
	@Inject
	public EditorView(Composite parent) {
		text = new Text(parent, SWT.NONE);
		
	}
	
	@Inject
	public void setInput(@Optional Contact contact){
		if(contact==null){
			return;
		}
		text.setText(contact.getName());
	}
	
	
	@Focus
	public void onFocus() {
		text.setFocus();
	}
	
	
	@Persist
	public void save() {
		//TODO Your code here
	}
	
}