package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotation;

public class CreateleadDataProvider extends Annotation{
	//@Test(invocationCount =2)
	//@Test(groups= {"smoke"})
	
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
		WebElement industrydrop = locateElement("name", "industryEnumId");
		selectDropDownUsingValue(industrydrop, industry);	
		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);
	}
	
	
	@DataProvider(name="fetchData") // indices will execute only the second data
	
 public Object[][] getData()
		{
		String [][] data = new String[2][4];
		
		data [0][0] = "TestLeaf";
		data [0][1] = "Lakshmi";
		data [0][2] = "S";
		data [0][3] = "IND_AEROSPACE";
		
		data [1][0] = "TestLeaf1";
		data [1][1] = "guga";
		data [1][2] = "priya";
		data [1][3] = "IND_HARDWARE";
		
		return data; 
	    
	    
		
	}

}
