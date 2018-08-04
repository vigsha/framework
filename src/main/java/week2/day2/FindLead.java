package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	    driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	    driver.findElementByXPath("//a[contains(text(),'Merge Leads").click();
	    driver.findElementByXPath("(//img[@alt='Lookup'])[2]");
		
	}

}
