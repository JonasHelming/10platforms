package client2.app;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;

import org.eclipse.emf.ecp.view.model.fx.ECPFXViewRenderer;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.fx.osgi.util.AbstractJFXApplication;

import submission.Submission;
import submission.SubmissionFactory;

public class MainApplication extends AbstractJFXApplication {
	protected void jfxStart(IApplicationContext applicationContext, Application jfxApplication, Stage primaryStage) {
		Scene s = new Scene(new Label("Hello World"));
		primaryStage.setScene(s);
		primaryStage.setWidth(300);
		primaryStage.setHeight(400);
		primaryStage.setTitle("Hello World");
		Submission submission = SubmissionFactory.eINSTANCE.createSubmission();
		ECPFXViewRenderer.INSTANCE.render(submission);
		primaryStage.show();
	}
}
