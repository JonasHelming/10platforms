package org.example.progressdemo.handlers;

import org.eclipse.core.runtime.IProgressMonitor;

public class ConsoleMonitor implements IProgressMonitor {

	private int totalWork;
	private String name;
	private int completed =0;

	@Override
	public void beginTask(String name, int totalWork) {
		this.name = name;
		this.totalWork = totalWork;
		System.out.println("Starting job: "+name);

	}

	@Override
	public void done() {
		System.out.println(name+ " COMPLETE");

	}

	@Override
	public void internalWorked(double work) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isCanceled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCanceled(boolean value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTaskName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subTask(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void worked(int work) {
		completed  +=work;
		System.out.println("Progress on "+name+": "+completed+" of "+totalWork);

	}

}
