package com.wizardFromWebsiteExample;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

class ComplaintsPage extends WizardPage {
	  private Button yes;
	  private Button no;

	  /**
	   * ComplaintsPage constructor
	   */
	  public ComplaintsPage() {
	    super("Complaints");
	  }

	  /**
	   * Creates the page controls
	   */
	  public void createControl(Composite parent) {
	    Composite composite = new Composite(parent, SWT.NONE);
	    composite.setLayout(new GridLayout(2, true));

	    new Label(composite, SWT.LEFT).setText("Do you have complaints?");
	    Composite yesNo = new Composite(composite, SWT.NONE);
	    yesNo.setLayout(new FillLayout(SWT.VERTICAL));

	    yes = new Button(yesNo, SWT.RADIO);
	    yes.setText("Yes");

	    no = new Button(yesNo, SWT.RADIO);
	    no.setText("No");

	    setControl(composite);
	  }

	  public IWizardPage getNextPage() {
	    // If they have complaints, go to the normal next page
	    if (yes.getSelection()) { return super.getNextPage(); }
	    // No complaints? Short-circuit the rest of the pages
	    return getWizard().getPage("Thanks");
	  }
	}
