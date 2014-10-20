package client2.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.eclipse.emf.ecp.view.model.fx.ECPFXView;
import org.eclipse.emf.ecp.view.model.fx.ECPFXViewRenderer;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.fx.osgi.util.AbstractJFXApplication;

import submission.Submission;
import submission.SubmissionFactory;

public class MainApplication extends AbstractJFXApplication {
	protected void jfxStart(IApplicationContext applicationContext, Application jfxApplication, Stage primaryStage) {
		BorderPane pane=new BorderPane();
		Scene s = new Scene(pane);
		primaryStage.setScene(s);
		primaryStage.setWidth(300);
		primaryStage.setHeight(400);
		primaryStage.setTitle("Hello World");
		Submission submission = SubmissionFactory.eINSTANCE.createSubmission();
		ECPFXView ecpfxView = ECPFXViewRenderer.INSTANCE.render(submission);
		pane.setCenter(ecpfxView.getFXNode());
		primaryStage.show();
	}
}
