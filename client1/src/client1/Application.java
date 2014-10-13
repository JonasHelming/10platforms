package client1;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import submission.SubmissionFactory;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {
	
	
	public static void fillShell(final Shell shell) throws ECPRendererException{
		final EObject newObject = SubmissionFactory.eINSTANCE.createSubmission();
		ECPSWTViewRenderer.INSTANCE.render(shell, newObject,
				ViewProviderHelper.getView(newObject, null));
		Button button = new Button(shell, SWT.PUSH);
		button.setText("Submit");
		button.addSelectionListener(new SelectionAdapter() {		
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shell.getShell(), "", newObject.toString());
				
			}					
		});
		
		
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new GridLayout());
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
			
			@Override
			public void run() {
				try {
					fillShell(shell);
					
				} catch (final ECPRendererException ex) {
					ex.printStackTrace();
				}
				

				shell.open();

				// run the event loop as long as the window is open
				while (!shell.isDisposed()) {
					// read the next OS event queue and transfer it to a SWT event
					if (!display.readAndDispatch())
					{
						// if there are currently no other OS event to process
						// sleep until the next OS event is available
						display.sleep();
					}
				}

				
			}

			
		});
			return null;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		
	}
}
