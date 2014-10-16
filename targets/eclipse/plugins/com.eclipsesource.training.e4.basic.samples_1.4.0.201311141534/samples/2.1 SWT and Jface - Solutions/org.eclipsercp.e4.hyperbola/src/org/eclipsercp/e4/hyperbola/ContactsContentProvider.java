package org.eclipsercp.e4.hyperbola;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipsercp.e4.hyperbola.model.ContactEntry;
import org.eclipsercp.e4.hyperbola.model.ContactGroup;

public class ContactsContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {
		ContactGroup contactGroup =(ContactGroup) inputElement;
		return contactGroup.getContacts().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof ContactGroup){
			return ((ContactGroup) parentElement).getContacts().toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof ContactEntry){
			((ContactEntry) element).eContainer();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof ContactGroup){
			return !((ContactGroup) element).getContacts().isEmpty();
		}
		return false;
	}

}
