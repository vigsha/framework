package testcase;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotation;

public class EditLead extends Annotation {
//@Test(dependsOnMethods= {"testcase.Createlead.createLead"})
	@Test(groups= {"sanity"})

	public void editLeads() {

    WebElement Leadslink = locateElement("link","Leads");
	click(Leadslink);
	WebElement FindLeads = locateElement("link","Find Leads");
	click(FindLeads);
	WebElement firstname = locateElement("xpath","//span[contains(text(),'Find by')]/following::input[2]");
	type(firstname,"venkyraja");
	WebElement FindLeadsbutton = locateElement("xpath","//span[contains(text(),'Name and ID')]//following::button[1]");
	click(FindLeadsbutton);
	WebElement firstlead = locateElement("xpath","//a[contains(text(),'10190')]");
	click(firstlead);
	WebElement phonenumber = locateElement("xpath","//input[@name='phoneNumber']");
	click(phonenumber);
	//span[contains(text(),"Phone")]/following::button[1]
	WebElement findleads = locateElement("xpath","//span[contains(text(),'Phone')]/following::button[1]");
	click(findleads);
	WebElement resultingfirstlead = locateElement("xpath","//span[contains(text(),'Phone')]/following::button[1]");
	click(resultingfirstlead);
	verifyTitle("View Lead");
	 WebElement EditLeadslink = locateElement("link","Edit");
		click(EditLeadslink);
		WebElement updatecompanyname = locateElement("id", "updateLeadForm_companyName");
		type(updatecompanyname, "CINDAN");
		WebElement update = locateElement("xpath","//input[@value='Update']");
		click(update);
		WebElement companycheck = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
		verifyExactText(companycheck,"CINDAN");

	}


	
}