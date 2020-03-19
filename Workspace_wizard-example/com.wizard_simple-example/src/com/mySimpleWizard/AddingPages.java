package com.mySimpleWizard;

import org.eclipse.jface.wizard.Wizard;

public class AddingPages extends Wizard {
	
	
	  public AddingPages() {
		    // Add the pages
		    addPage(new FirstPage());
		    addPage(new SecondPage());
//		    addPage(new ThanksPage());
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
