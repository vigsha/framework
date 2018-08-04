package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class MyLeads extends Annotation {

	public MyLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLeads;
	
	public CreateLeads clickCreatelead()
	{
		click(eleCreateLeads);
		return new CreateLeads();
	}


	}


