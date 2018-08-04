package week6.day1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotation;

public class CreateleadDataProvider extends Annotation{
	//@Test(invocationCount =2)
	//@Test(groups= {"smoke"})

	@BeforeTest
	
	public void setvalue() {
		excelFileName = "CreateLead";
		testName = "Createlead";
		testDesc = "New lead Creation";
		category = "smoke";
		author="laks";
		moduleName = "Leads";
		
	}
	
	@Test (dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName,String industry)
	{
		WebElement lead = locateElement("link","Create Lead");
		click(lead);
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName,cName);
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, fName);
		WebElement lastname = locateElement("id", "createLeadForm_lastName");
		type(lastname, lName);
		WebElement industrydrop = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingText(industrydrop, industry);	
		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);
	}
	
	
	@DataProvider(name="fetchData")
	
 public Object[][] getData() throws IOException
		{
		ReadExcel excel = new ReadExcel();
		return excel.readExcel("CreateLead");     
		
	}

}
