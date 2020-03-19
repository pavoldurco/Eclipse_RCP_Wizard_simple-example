package com.wizardFromWebsiteExample;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

class MoreInformationPage extends WizardPage {
	  /**
	   * MoreInformationPage constructor
	   */
	  public MoreInformationPage() {
	    super("More Info");
	  }

	  /**
	   * Creates the controls for this page
	   */
	  public void createControl(Composite parent) {
	    Composite composite = new Composite(parent, SWT.NONE);
	    composite.setLayout(new GridLayout(1, false));

	    new Label(composite, SWT.LEFT).setText("Please enter your complaints");
	    Text text = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
	    text.setLayoutData(new GridData(GridData.FILL_BOTH));

	    setControl(composite);
	  }
	}
