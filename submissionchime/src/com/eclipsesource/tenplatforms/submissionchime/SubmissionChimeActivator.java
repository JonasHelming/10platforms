package com.eclipsesource.tenplatforms.submissionchime;

import java.io.IOException;

import org.eclipse.emf.ecp.emf2web.WebHandler;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SubmissionChimeActivator implements BundleActivator {

	private static final String URL = "http://localhost:9000";
	private static final String SUBMISSION = "Submission";
	private static final long POLL_INTERVAL = 1000;

	private int currentCount = 0;

	public void start(BundleContext context) throws Exception {
		final WebHandler handler = new WebHandler(URL);
		new Thread() {
			public void run() {
				while (true) {
					try {
						int count = handler.getNumberOfWebElements(SUBMISSION);
						if (currentCount != count) {
							currentCount = count;
							ringTheBell();
						}
						sleep(POLL_INTERVAL);
					} catch (InterruptedException e) {
						// just exit
					} catch (IOException e) {
						System.err.println("Cannot fetch number for "
								+ SUBMISSION);
					}
				}
			}
		}.start();
	}

	private void ringTheBell() {
		System.out.println("The bell should ring now!");
		try {
			HttpResponse<String> response = Unirest
					.post("http://10.0.0.32:8080/rest/items/Chime_On")
					.body("ON").asString();
			System.out.println(response.getBody());
		} catch (UnirestException e) {
			e.printStackTrace();
		}
	};

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping submission counter...");
	}
}
