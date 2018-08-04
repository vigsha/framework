package week2.day1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateLead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(false);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest suitTest = extent.createTest("TC001","Create Lead is successful");
		ExtentTest test = suitTest.createNode("Leads");	
	

		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");		
		test.pass("Browser launched successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Lakshmi");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		WebElement Industry =driver.findElementById("createLeadForm_industryEnumId");
        Select dd = new Select(Industry);
        dd.selectByVisibleText("Insurance");
        List <WebElement> alloptions = dd.getOptions();
        int size = alloptions.size();
        System.out.println(size);
        for (WebElement eachoption: alloptions)
        {
        	System.out.println(eachoption.getText());
        }
        driver.findElementByClassName("smallSubmit").click();
        
        extent.flush();

	}

}
