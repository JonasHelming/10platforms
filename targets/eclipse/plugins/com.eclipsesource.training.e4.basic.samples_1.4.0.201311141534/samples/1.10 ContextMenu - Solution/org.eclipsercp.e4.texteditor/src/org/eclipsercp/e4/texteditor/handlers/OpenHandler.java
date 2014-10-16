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
package org.eclipsercp.e4.texteditor.handlers;

import java.lang.reflect.InvocationTargetException;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipsercp.e4.texteditor.FileInput;


public class OpenHandler {
	@Inject
	EPartService partService;

	@Execute
	public void execute(IEclipseContext context,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell, MWindow window)
			throws InvocationTargetException, InterruptedException {
		FileDialog dialog = new FileDialog(shell);
		String selectedFile = dialog.open();
		MPart part = partService.showPart(
				partService.createPart("net.teufel.e4.texteditor.part.datei"),
				PartState.ACTIVATE);
		part.getContext().set("selectedFile", new FileInput(selectedFile));
	}
}
