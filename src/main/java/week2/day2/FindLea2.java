package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLea2 {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(3000);
		//driver.findElementByXPath("//label[contains(text(),'First name:')]//following::input[1]").sendKeys("Laks");
		driver.findElementByXPath("//div[@class='gwtWidget subSectionBlock']//div[@class='x-form-item x-tab-item']//following::input[2]").sendKeys("ShanmugaLakshmi");
		Thread.sleep(3000);		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "View Lead";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		System.out.println("Title Matched");
		else
		System.out.println("Title didn't match");
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();		
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCScompany");
		driver.findElementByXPath("//input[contains(text(),'Update')]").click();
		//String actualCompany = driver.getText();
		//String expectedCompany = "View Lead";
				//if(actualCompany.equals(expectedCompany))
					System.out.println("company Matched");
		

	}

}
