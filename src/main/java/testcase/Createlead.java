package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import wdMethods.Annotation;

public class Createlead extends Annotation{
	//@Test(invocationCount =2)
	@Test(groups= {"smoke"})
	public void createLead()
	{
		WebElement lead = locateElement("link","Create Lead");
		click(lead);
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName, "TATA");
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, "VENKYRAJA");
		WebElement lastname = locateElement("id", "createLeadForm_lastName");
		type(lastname, "GR");
		WebElement industrydrop = locateElement("name", "industryEnumId");
		selectDropDownUsingValue(industrydrop, "IND_HARDWARE");	
		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);
	}

}
