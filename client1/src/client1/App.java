package client1;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.emf2web.WebHandler;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.fx.runtime.swtutil.SWTUtil;
import org.eclipse.fx.runtime.swtutil.SWTUtil.BlockCondition;
import org.eclipse.fx.runtime.swtutil.SWTUtil.SWTAppStart;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.oomph.internal.ui.AccessUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import submission.SubmissionFactory;

public class App implements SWTAppStart {
	public static void fillShell(final Shell shell) throws ECPRendererException{
		final EObject newObject = SubmissionFactory.eINSTANCE.createSubmission();
		ECPSWTViewRenderer.INSTANCE.render(shell, newObject,
				ViewProviderHelper.getView(newObject, null));
		Button button = new Button(shell, SWT.PUSH);
		button.setText("Submit");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				try {
					AccessUtil.save(new File("C:/temp/submissionform.png"), shell);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				WebHandler webHandler = new WebHandler("http://localhost:9000");
				try {
					webHandler.createWebElement(newObject);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
	}

	@Override
	public BlockCondition createApp(Display display) {
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

				SWTUtil.getInstance().openBlocking(shell);

			}
		});
		return null;
	}

}
