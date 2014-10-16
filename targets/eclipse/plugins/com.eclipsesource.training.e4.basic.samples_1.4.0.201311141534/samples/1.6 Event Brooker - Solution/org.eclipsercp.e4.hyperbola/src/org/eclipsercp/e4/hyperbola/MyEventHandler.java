 
package org.eclipsercp.e4.hyperbola;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;

public class MyEventHandler {
	
	@Inject
	IEventBroker broker;

	@Execute
	public void execute() {
		broker.post("MyEvent", "Test");
	}
	
	
	@CanExecute
	public boolean canExecute() {
		//TODO Your code goes here
		return true;
	}
		
}