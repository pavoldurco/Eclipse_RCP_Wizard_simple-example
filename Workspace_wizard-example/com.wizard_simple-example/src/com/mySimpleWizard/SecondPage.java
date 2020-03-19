package com.mySimpleWizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SecondPage extends WizardPage {

	  /**
	   * ThanksPage constructor
	   */
	  public SecondPage() {
	    super("Thanks");
	  }

	  /**
	   * Creates the controls for this page
	   */
	  public void createControl(Composite parent) {
	    Label label = new Label(parent, SWT.CENTER);
	    label.setText("Thanks!");
	    setControl(label);
	  }
	
}
