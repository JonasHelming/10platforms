package org.eclipsercp.e4.hyperbola;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;


public class ContactsView {

	public ContactsView(Composite parent){
		TreeViewer viewer = new TreeViewer(parent);
		viewer.setLabelProvider(new ContactsLabelProvider());
		viewer.setContentProvider(new ContactsContentProvider());
		viewer.setInput(ModelFactory.eINSTANCE.createExampleModel());
	}
	
}
