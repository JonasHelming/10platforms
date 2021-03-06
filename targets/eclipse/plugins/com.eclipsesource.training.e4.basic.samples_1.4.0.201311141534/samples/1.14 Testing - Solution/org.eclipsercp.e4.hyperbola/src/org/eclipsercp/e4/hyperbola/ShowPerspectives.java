package org.eclipsercp.e4.hyperbola;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;


public class ShowPerspectives {

	@Inject
	EModelService modelService;
	
	@Inject
	EPartService partService;
	
	@Execute
	void addViewMenu(MApplication application){
		MMenu menu = MMenuFactory.INSTANCE.createMenu();
		menu.setLabel("Perspectives");
		
		MTrimmedWindow mainWindow = (MTrimmedWindow) modelService.find(
				"org.eclipsercp.e4.hyperbola.trimmedwindow", application);
		MMenu mainMenu = mainWindow.getMainMenu();
		mainMenu.getChildren().add(menu);
		List<MPerspective> findElements = modelService.findElements(application, null, MPerspective.class, null);
		for (MPerspective perspective : findElements) {
			MDirectMenuItem menuItem = MMenuFactory.INSTANCE.createDirectMenuItem();
			menuItem.setLabel("Open "+perspective.getLabel());
			menuItem.setObject(new OpenPerspectiveHandler(perspective));
			menu.getChildren().add(menuItem);
		}
		
		
		
	}
}
