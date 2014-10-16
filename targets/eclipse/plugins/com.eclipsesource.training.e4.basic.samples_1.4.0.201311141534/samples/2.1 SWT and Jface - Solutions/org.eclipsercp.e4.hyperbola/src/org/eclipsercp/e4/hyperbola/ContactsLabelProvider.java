package org.eclipsercp.e4.hyperbola;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipsercp.e4.hyperbola.model.ContactEntry;

public class ContactsLabelProvider extends LabelProvider {

	

	@Override
	public String getText(Object element) {
		if(element instanceof ContactEntry){
			return ((ContactEntry) element).getName();
		}
		return super.getText(element);
	}

}
