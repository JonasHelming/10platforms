package org.eclipsercp.e4.hyperbola.extensions;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;


public class Processor {

	@Inject
	EModelService modelService;
	
	

	@Execute
	public void execute(MApplication application) {
		MMenu menu = MMenuFactory.INSTANCE.createMenu();
		menu.setLabel("Actions");
		
		MTrimmedWindow mainWindow = (MTrimmedWindow) modelService.find(
				"org.eclipsercp.e4.hyperbola.trimmedwindow", application);
		MMenu mainMenu = mainWindow.getMainMenu();
		
		MToolBar toolBar = (MToolBar) modelService.find(
				"org.eclipsercp.e4.hyperbola.toolbar", application);
		
		for(MToolBarElement item : toolBar.getChildren())
		if(item instanceof MHandledToolItem){
			MHandledToolItem toolItem = (MHandledToolItem) item;
			MHandledMenuItem menuItem = MMenuFactory.INSTANCE
					.createHandledMenuItem();
			menu.getChildren().add(menuItem);
			menuItem.setLabel(toolItem.getLabel());
			menuItem.setCommand(toolItem.getCommand());
			mainMenu.getChildren().add(menu);
		}
	}

}
