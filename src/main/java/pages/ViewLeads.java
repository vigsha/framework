package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class ViewLeads extends Annotation {

	public ViewLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement viewfname;
	
	public void verifyfname(String expectedText)
	{
		verifyExactText(viewfname, expectedText);
	}


}


