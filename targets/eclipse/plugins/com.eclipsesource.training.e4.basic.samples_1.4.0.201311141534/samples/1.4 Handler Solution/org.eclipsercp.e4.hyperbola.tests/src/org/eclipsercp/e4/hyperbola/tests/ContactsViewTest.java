package org.eclipsercp.e4.hyperbola.tests;

import org.eclipse.swt.widgets.Shell;
import org.eclipsercp.e4.hyperbola.ContactsView;

public class ContactsViewTest{

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		SWTViewTestHelper swtViewTestHelper = new SWTViewTestHelper();
		Shell shell = swtViewTestHelper.createShell();
		
		new ContactsView(shell);
		
		swtViewTestHelper.runShell(shell);
	}

}
