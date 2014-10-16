package org.eclipsercp.e4.hyperbola;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipsercp.e4.hyperbola.model.impl.ContactEntryImpl;

@SuppressWarnings("restriction")
public class DetailsView {
	
	@Inject
	Logger logger;
	
	private Label label;

	@Inject
	public DetailsView(Composite parent){
		label = new Label(parent, SWT.NONE);
	}
	
	@Inject
	public void setInput(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional ContactEntryImpl contactEntry){
		if(contactEntry==null){
			return;
		}
		if(contactEntry.getName()==null){
			label.setText("");
		}
		else{
			label.setText(contactEntry.getName());	
			logger.info("Selection Changed to: "+contactEntry.getName());
		}
	}
	

}
