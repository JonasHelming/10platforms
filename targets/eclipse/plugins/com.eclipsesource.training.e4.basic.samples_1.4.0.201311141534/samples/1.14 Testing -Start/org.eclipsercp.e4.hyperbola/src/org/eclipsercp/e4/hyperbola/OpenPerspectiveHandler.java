package org.eclipsercp.e4.hyperbola;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class OpenPerspectiveHandler {

	private MPerspective perspective;

	public OpenPerspectiveHandler(MPerspective perspective) {
		this.perspective = perspective;
	}
	@Execute
	public void execute(EPartService partService){
		partService.switchPerspective(perspective);
	}
	
	
}
