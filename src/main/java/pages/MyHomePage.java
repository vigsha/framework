package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotation;

public class MyHomePage extends Annotation {

	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	/*
	@FindBy(linkText="Leads")
	WebElement eleLeads;*/
	public  MyLeads clicklead()
	{
		WebElement lead = locateElement("link",prop.getProperty("MyHomePage.leads.link"));
		click(lead);
		
		
		//click(eleLeads);
		return new MyLeads();
	}

	}


