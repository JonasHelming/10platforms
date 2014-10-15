package client1;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.fx.runtime.swtutil.SWTUtil;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {
	public Object start(IApplicationContext context) throws Exception {
		SWTUtil.getInstance().bootstrap(new App());
		return null;
	}

	public void stop() {

	}
}
