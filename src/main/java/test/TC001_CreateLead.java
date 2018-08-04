package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotation;

public class TC001_CreateLead extends Annotation {

	@BeforeTest
	public void setvalue() {
		excelFileName = "CreateLead_1";
		testName = "TC001_CreateLead";
		testDesc = "New lead Creation";
		category = "smoke";
		author="laks";
		moduleName = "Leads";
		}
	
	@Test(dataProvider="fetchData")
	public void Createlead(String cName,String fName,String lName,String phNumber,String email) {
		new MyHomePage()
	    .clicklead()
	    .clickCreatelead()
	    .CompanyName(cName)
	    .FirstName(fName)
	    .LastName(lName)
	    .PhoneNumber(phNumber)
	    .MailID(email)
	    .clickSubmit()
	    .verifyfname(fName);
	}
	

	
	
	
	
}
