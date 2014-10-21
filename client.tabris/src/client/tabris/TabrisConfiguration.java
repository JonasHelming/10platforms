package client.tabris;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.application.Application.OperationMode;

import com.eclipsesource.tabris.TabrisClientInstaller;
import com.eclipsesource.tabris.ui.PageConfiguration;
import com.eclipsesource.tabris.ui.TabrisUIEntrypointFactory;
import com.eclipsesource.tabris.ui.UIConfiguration;


public class TabrisConfiguration implements ApplicationConfiguration {

	public void configure(Application application) {
		bootstrap(application);
		application.setOperationMode(OperationMode.SWT_COMPATIBILITY);
		application.addEntryPoint("/demo", new TabrisUIEntrypointFactory(createUIConfiguration()), null);
	}
	
	private UIConfiguration createUIConfiguration() {
		UIConfiguration uiConfiguration = new UIConfiguration();
	    PageConfiguration topLevelPage = new PageConfiguration("topLevelPage", ExamplePage.class);
	    topLevelPage.setTopLevel(true);
	    //topLevelPage.setTitle("Tabris Demo");
	    uiConfiguration.addPageConfiguration(topLevelPage);
	    
		return uiConfiguration;
	}

	private void bootstrap(Application application) {
		TabrisClientInstaller.install(application);
	}
}
