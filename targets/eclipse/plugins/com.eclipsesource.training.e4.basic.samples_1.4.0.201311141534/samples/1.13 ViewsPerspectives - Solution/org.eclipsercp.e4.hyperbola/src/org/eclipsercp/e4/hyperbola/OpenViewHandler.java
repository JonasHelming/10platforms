package org.eclipsercp.e4.hyperbola;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;


public class OpenViewHandler {

	private MPart mPart;

	public OpenViewHandler(MPart mPart) {
		this.mPart = mPart;
	}
	
	@Execute
	public void execute(EPartService partService){
		partService.showPart(mPart, PartState.ACTIVATE);
	}

}
