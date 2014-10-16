package org.eclipsercp.e4.hyperbola;

import org.eclipse.e4.core.services.log.Logger;

@SuppressWarnings("restriction")
public class CustomLogger extends Logger {

	@Override
	public void warn(Throwable t, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trace(Throwable t, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void info(Throwable t, String message) {
		System.out.println("This is my Custom Logger: "+message);
		
	}

	@Override
	public void error(Throwable t, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(Throwable t, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(Throwable t) {
		// TODO Auto-generated method stub
		
	}

}
