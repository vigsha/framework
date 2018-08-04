package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class FrameWorkCreateLead extends SeMethods {
	@Test

	public void login() {
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfa = locateElement("link","CRM/SFA");
	    click(crmsfa);
		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);
		WebElement company = locateElement("id","createLeadForm_companyName");
		type(company,"TCS");
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName,"Guga");
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName,"Priya");
		WebElement src = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(src,"Cold Call");
		WebElement industryDD = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingIndex(industryDD,7);
		WebElement ownershipDD = locateElement("id","createLeadForm_ownershipEnumId");
		selectDropDownUsingValue(ownershipDD,"OWN_LLC_LLP");
		WebElement createLeadSubmit = locateElement("class","smallSubmit");
	   click(createLeadSubmit);
	    
	    
		
	}

	

}
