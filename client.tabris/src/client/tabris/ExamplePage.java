package client.tabris;


import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.service.UISession;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import client1.App;

import com.eclipsesource.tabris.ui.AbstractPage;
import com.eclipsesource.tabris.ui.PageData;

public class ExamplePage extends AbstractPage {

	@Override
	public void createContent(Composite parent, PageData data) {
		parent.setLayout(new GridLayout());
		setupRealm(Display.getCurrent());		
		try {
			App.fillShell(parent);
		} catch (ECPRendererException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static final long serialVersionUID = 7800936887572548646L;

	protected void setupRealm(Display display) {
		UISession uiSession = RWT.getUISession();
		if (uiSession.getAttribute("realm") == null) {
			Realm realm = SWTObservables.getRealm(display);
			RealmSetter.setRealm(realm);
			RWT.getUISession().setAttribute("realm", realm);
		}
	}
	

}
