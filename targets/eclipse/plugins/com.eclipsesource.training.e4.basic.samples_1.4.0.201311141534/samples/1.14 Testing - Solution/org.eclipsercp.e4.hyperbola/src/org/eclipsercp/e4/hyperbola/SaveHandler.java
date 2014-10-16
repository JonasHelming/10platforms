 
package org.eclipsercp.e4.hyperbola;

import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SaveHandler {
	
	@Execute
	public void execute(@Active MPart part,EPartService partService) {
		partService.savePart(part, false);
	}
	
	
	@CanExecute
	public boolean canExecute(@Active MPart part) {
		return part.isDirty();
	}
		
}