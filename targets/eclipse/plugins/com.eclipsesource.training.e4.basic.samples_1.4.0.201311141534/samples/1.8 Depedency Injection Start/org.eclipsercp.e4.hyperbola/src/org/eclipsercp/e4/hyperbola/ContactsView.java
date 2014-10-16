package org.eclipsercp.e4.hyperbola;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipsercp.e4.hyperbola.model.ContactService;
import org.eclipsercp.e4.hyperbola.model.provider.ModelItemProviderAdapterFactory;


public class ContactsView {
	
	private final class SelectionListener implements
			ISelectionChangedListener {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			Object firstElement = ((IStructuredSelection)event.getSelection()).getFirstElement();
			selectionService.setSelection(firstElement);
		}
	}

	@Inject
	ESelectionService selectionService;
	
	@Inject
	ContactService contactService;

	
	private TreeViewer viewer;

	private SelectionListener selectionChangeListener;
	
	@Inject
	public ContactsView(Composite parent){
		viewer = new TreeViewer(parent);
	}
	
	
	@PostConstruct
	public void init(){
		ModelItemProviderAdapterFactory adapterFactory = new ModelItemProviderAdapterFactory();
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		selectionChangeListener = new SelectionListener();
		viewer.addSelectionChangedListener(selectionChangeListener);
		viewer.setInput(contactService.getRootGroup());
	}
	
	@PreDestroy
	public void dispose(){
		viewer.removeSelectionChangedListener(selectionChangeListener);
	}
	
	@Focus
	public void setFocus(){
		viewer.getControl().setFocus();
	}
	
}
