/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.example.progressdemo.handlers;

import java.lang.reflect.InvocationTargetException;

import javax.inject.Named;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.ProgressProvider;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Shell;

public class OpenHandler {

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell)
			throws Exception {
		showBusyIndicator(shell);
		showProgressDialog(shell);
		showSubTasks(shell);
		showSubMonitors(shell);
		showJobs();
	}

	private void showJobs() {
		IJobManager jobManager = Job.getJobManager();
		jobManager.setProgressProvider(new ProgressProvider() {

			@Override
			public IProgressMonitor createMonitor(Job job) {
				return new ConsoleMonitor();
			}
		});
		Job job = new Job("My Job") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {

				monitor.beginTask("My Task", 10);
				do10Steps(monitor);
				monitor.done();
				return org.eclipse.core.runtime.Status.OK_STATUS;
			}

		};
		job.schedule();
		Job job2 = new Job("My second Job") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("My second Task", 100);
				do10Steps(monitor);
				monitor.done();
				return org.eclipse.core.runtime.Status.OK_STATUS;
			}
		};
		job2.schedule();

	}

	private void showSubMonitors(Shell shell) throws InvocationTargetException,
			InterruptedException {
		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(
				shell);
		progressMonitorDialog.open();

		progressMonitorDialog.run(true, true, new IRunnableWithProgress() {

			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				monitor.beginTask("MyTask", 100);
				for (int i = 0; i < 10; i++) {
					SubProgressMonitor subProgressMonitor = new SubProgressMonitor(
							monitor, 10);
					subProgressMonitor.beginTask("MyTask", 10);
					subProgressMonitor.subTask("Sub Task: " + i);
					do10Steps(subProgressMonitor);
				}

			}
		});

	}

	private void showSubTasks(Shell shell) throws InvocationTargetException,
			InterruptedException {
		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(
				shell);
		progressMonitorDialog.open();

		progressMonitorDialog.run(true, true, new IRunnableWithProgress() {

			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				monitor.beginTask("MyTask", 10);
				for (int i = 0; i < 10; i++) {
					if (monitor.isCanceled()) {
						break;
					}
					monitor.subTask("Sub Task: " + i);
					monitor.worked(1);
					doSth(300);

				}

			}
		});

	}

	private void showProgressDialog(Shell shell)
			throws InvocationTargetException, InterruptedException {
		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(
				shell);
		progressMonitorDialog.open();
		progressMonitorDialog.run(true, true, new IRunnableWithProgress() {

			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				monitor.beginTask("MyTask", 10);
				do10Steps(monitor);
			}
		});

	}

	private void showBusyIndicator(Shell shell) {
		BusyIndicator.showWhile(shell.getDisplay(), new Runnable() {
			@Override
			public void run() {
				doSth(2000);
			}

		});
	}

	private void do10Steps(IProgressMonitor monitor) {
		for (int i = 0; i < 10; i++) {
			if (monitor.isCanceled()) {
				break;
			}
			monitor.worked(1);
			doSth(300);
		}
	}

	private void doSth(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
