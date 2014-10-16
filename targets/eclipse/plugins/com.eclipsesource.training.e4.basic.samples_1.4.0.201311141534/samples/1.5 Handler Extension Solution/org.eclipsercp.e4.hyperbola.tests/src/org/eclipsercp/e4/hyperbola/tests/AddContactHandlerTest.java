package org.eclipsercp.e4.hyperbola.tests;

import static org.junit.Assert.*;

import org.eclipsercp.e4.hyperbola.AddContactHandler;
import org.eclipsercp.e4.hyperbola.model.ContactGroup;
import org.eclipsercp.e4.hyperbola.model.ModelFactory;
import org.junit.Test;

public class AddContactHandlerTest {

	@Test
	public void testAddContactHanler() {
		AddContactHandler addContactHandler = new AddContactHandler();
		ContactGroup createContactGroup = ModelFactory.eINSTANCE.createContactGroup();
		addContactHandler.createContact(createContactGroup);
		assertEquals(1, createContactGroup.getContacts().size());
		
	}

}
