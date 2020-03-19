package com.wizardFromWebsiteExample;

import org.eclipse.jface.wizard.Wizard;

class B_SurveyWizard extends Wizard {
	  public B_SurveyWizard() {
	    // Add the pages
	    addPage(new ComplaintsPage());
	    addPage(new MoreInformationPage());
	    addPage(new ThanksPage());
	  }

	  /**
	   * Called when user clicks Finish
	   * 
	   * @return boolean
	   */
	  public boolean performFinish() {
	    // Dismiss the wizard
	    return true;
	  }
	}

