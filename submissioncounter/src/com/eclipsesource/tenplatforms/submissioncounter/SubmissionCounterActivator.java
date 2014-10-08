package com.eclipsesource.tenplatforms.submissioncounter;

import java.io.IOException;

import org.eclipse.emf.ecp.emf2web.WebHandler;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SubmissionCounterActivator implements BundleActivator {

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
							printCurrentCount();
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

	private void printCurrentCount() {
		System.out.println(asciiArt(currentCount));
	};

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping submission counter...");
	}

	private static String asciiArt(int number) {
		switch (number) {
		case 0:
			return zero();
		case 1:
			return one();
		case 2:
			return two();
		case 3:
			return three();
		case 4:
			return four();
		case 5:
			return five();
		case 6:
			return six();
		default:
			return String.valueOf(number);
		}
	}

	private static String zero() {
		StringBuilder sb = new StringBuilder();
		sb.append("   ___  \n");
		sb.append("  / _ \\ \n");
		sb.append(" | | | |\n");
		sb.append(" | | | |\n");
		sb.append(" | |_| |\n");
		sb.append("  \\___/ \n");
		return sb.toString();
	}

	private static String one() {
		StringBuilder sb = new StringBuilder();
		sb.append("  __ \n");
		sb.append(" /_ |\n");
		sb.append("  | |\n");
		sb.append("  | |\n");
		sb.append("  | |\n");
		sb.append("  |_|\n");
		return sb.toString();
	}

	private static String two() {
		StringBuilder sb = new StringBuilder();
		sb.append("  ___  \n");
		sb.append(" |__ \\ \n");
		sb.append("    ) |\n");
		sb.append("   / / \n");
		sb.append("  / /_ \n");
		sb.append(" |____|\n");
		return sb.toString();
	}

	private static String three() {
		StringBuilder sb = new StringBuilder();
		sb.append("  ____  \n");
		sb.append(" |___ \\ \n");
		sb.append("   __) |\n");
		sb.append("  |__ < \n");
		sb.append("  ___) |\n");
		sb.append(" |____/ \n");
		return sb.toString();
	}

	private static String four() {
		StringBuilder sb = new StringBuilder();
		sb.append("  _  _   \n");
		sb.append(" | || |  \n");
		sb.append(" | || |_ \n");
		sb.append(" |__   _|\n");
		sb.append("    | |  \n");
		sb.append("    |_|  \n");
		return sb.toString();
	}

	private static String five() {
		StringBuilder sb = new StringBuilder();
		sb.append("  _____ \n");
		sb.append(" | ____|\n");
		sb.append(" | |__  \n");
		sb.append(" |___ \\ \n");
		sb.append("  ___) |\n");
		sb.append(" |____/ \n");
		return sb.toString();
	}

	private static String six() {
		StringBuilder sb = new StringBuilder();
		sb.append("    __  \n");
		sb.append("   / /  \n");
		sb.append("  / /_  \n");
		sb.append(" | '_ \\ \n");
		sb.append(" | (_) |\n");
		sb.append("  \\___/ \n");
		return sb.toString();
	}

}
