package org.eclipsercp.e4.hyperbola;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class ShowViews {
	@Inject
	EModelService modelService;
	
	@Inject
	EPartService partService;
	
	@Execute
	void addViewMenu(MApplication application){
		MMenu menu = MMenuFactory.INSTANCE.createMenu();
		menu.setLabel("Views");
		
		MTrimmedWindow mainWindow = (MTrimmedWindow) modelService.find(
				"org.eclipsercp.e4.hyperbola.trimmedwindow", application);
		MMenu mainMenu = mainWindow.getMainMenu();
		mainMenu.getChildren().add(menu);
		List<MPart> findElements = modelService.findElements(application, null, MPart.class, null);
		for (MPart mPart : findElements) {
			MDirectMenuItem menuItem = MMenuFactory.INSTANCE.createDirectMenuItem();
			menuItem.setLabel("Open "+mPart.getLabel());
			menuItem.setObject(new OpenViewHandler(mPart));
			menu.getChildren().add(menuItem);
		}
		
		
		
	}

}
