package com.wizardFromWebsiteExample;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class A_Survey {
	  /**
	   * Runs the application
	   */
	  public void run() {
	    Display display = new Display();

	    // Create the parent shell for the dialog, but don't show it
	    Shell shell = new Shell(display);

	    // Create the dialog
	    WizardDialog dlg = new WizardDialog(shell, new B_SurveyWizard());
	    dlg.open();

	    // Dispose the display
	    display.dispose();
	  }

	  /**
	   * The application entry point
	   * 
	   * @param args
	   *            the command line arguments
	   */
	  public static void main(String[] args) {
	    new A_Survey().run();
	  }
	}
