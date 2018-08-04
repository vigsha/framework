package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MyHomePage;
import wdMethods.Annotation;

public class TC002_CreateLeadNegative extends Annotation {

	@BeforeTest
	public void setvalue() {
		excelFileName = "CreateLead_Negative";
		testName = "TC001_CreateLead";
		testDesc = "New lead Creation";
		category = "smoke";
		author="laks";
		moduleName = "Leads";
		}
	
	@Test(dataProvider="fetchData")
	public void Createlead(String cName,String fName,String lName,String phNumber,String email,String eleerrmsg) {
		new MyHomePage()
	    .clicklead()
	    .clickCreatelead()
	    .CompanyName(cName)
	    .FirstName(fName)
	    .LastName(lName)
	    .PhoneNumber(phNumber)
	    .MailID(email)
	    .clickSubmit()
	   // new CreateLeads() 
	   .verifyErrMsg(eleerrmsg);
	   //.verifyfname(fName);
	}
	
}
