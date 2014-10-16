package org.eclipsercp.e4.hyperbola.tests;

import org.eclipse.swt.widgets.Shell;
import org.eclipsercp.e4.hyperbola.DetailsView;
import org.eclipsercp.e4.hyperbola.model.Contact;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;

public class DetailsViewTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SWTViewTestHelper swtViewTestHelper = new SWTViewTestHelper();
		Shell shell = swtViewTestHelper.createShell();
		DetailsView detailsView = new DetailsView(shell);
		Contact contact = ModelFactory.eINSTANCE.createContact();
		contact.setName("Test");
		detailsView.setInput(contact);
		swtViewTestHelper.runShell(shell);
	}

}
