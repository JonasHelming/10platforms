package client2.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.eclipse.emf.ecp.emf2web.WebHandler;
import org.eclipse.emf.ecp.view.model.fx.ECPFXView;
import org.eclipse.emf.ecp.view.model.fx.ECPFXViewRenderer;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.fx.osgi.util.AbstractJFXApplication;

import submission.Submission;
import submission.SubmissionFactory;

public class MainApplication extends AbstractJFXApplication {

	private void fillPane(BorderPane pane) {
		final Submission submission = SubmissionFactory.eINSTANCE.createSubmission();
		ECPFXView ecpfxView = ECPFXViewRenderer.INSTANCE.render(submission);
		pane.setCenter(ecpfxView.getFXNode());
		Button button = new Button();
		button.setText("Submit");
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				WebHandler webHandler = new WebHandler("http://localhost:9000");
				try {
					webHandler.createWebElement(submission);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		pane.setBottom(button);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	protected void jfxStart(IApplicationContext applicationContext, Application jfxApplication, Stage primaryStage) {
		BorderPane pane=new BorderPane();
		Scene s = new Scene(pane);
		primaryStage.setScene(s);
		primaryStage.setWidth(300);
		primaryStage.setHeight(200);
		primaryStage.setTitle("Hello World");
		fillPane(pane);
		primaryStage.show();
	}
}
