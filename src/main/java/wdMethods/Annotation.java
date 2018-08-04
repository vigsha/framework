package wdMethods;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ReadExcel;

public class Annotation extends SeMethods {

	public String excelFileName,testName,testDesc,category,author,moduleName;

	@BeforeSuite
	public void startSuite() throws FileNotFoundException, IOException
	{
		beginResult();
		loadObject();
	}

	@BeforeClass
	public void startTest() 
	{
		startTest(testName,testDesc);		

	}		

	@BeforeMethod
	//(groups= {"common"})
	@Parameters({"url","pwd","uName"})
	public void login(String url,String pwd,String uName)		
	{	
		startTestIteration(moduleName,author,category);
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uName);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement link = locateElement("link","CRM/SFA");
		click(link);

	}

	@AfterMethod	
	public void closeapp()
	{
		closeAllBrowsers();
		endResult();
	}

	@DataProvider(name="fetchData")
    public Object[][] getData() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		return excel.readExcel(excelFileName); 	    

	}


}


