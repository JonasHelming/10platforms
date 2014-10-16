 
package org.eclipsercp.e4.hyperbola;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

@SuppressWarnings("restriction")
public class ShowDetailsViewHandler {
	

	@Execute
	public void execute(MApplication application) {
		MWindow window = MBasicFactory.INSTANCE.createWindow();
		MPart part = MBasicFactory.INSTANCE.createPart();
		window.getChildren().add(part);
		application.getChildren().add(window);
		IEclipseContext context = part.getContext();
		context.set(Logger.class, new CustomLogger());
		ContextInjectionFactory.make(DetailsView.class, context);
	}
	
	
	@CanExecute
	public boolean canExecute() {
		//TODO Your code goes here
		return true;
	}
		
}