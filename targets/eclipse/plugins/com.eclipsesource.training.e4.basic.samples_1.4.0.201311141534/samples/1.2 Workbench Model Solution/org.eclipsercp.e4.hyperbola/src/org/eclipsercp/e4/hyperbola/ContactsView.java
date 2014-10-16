package org.eclipsercp.e4.hyperbola;

import javax.inject.Inject;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;
import org.eclipsercp.e4.hyperbola.model.provider.ModelItemProviderAdapterFactory;


public class ContactsView {


	
	@Inject
	public ContactsView(Composite parent){
		TreeViewer viewer = new TreeViewer(parent);
		AdapterFactory adapterFactory = new ModelItemProviderAdapterFactory();
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setInput(ModelFactory.eINSTANCE.createExampleModel());
	}
	
}
