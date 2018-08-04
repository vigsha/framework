package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MediumProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Shanmuga lakshmi");
		driver.findElementById("lastNameField").sendKeys("vignesh");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Guga");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Priya");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Mrs");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Title");
		driver.findElementById("createContactForm_departmentName").sendKeys("Department");
		WebElement preCurrency =driver.findElementById("createContactForm_preferredCurrencyUomId");
        Select s = new Select(preCurrency);
        s.selectByVisibleText("INR - Indian Rupee");
        driver.findElementById("createContactForm_description").sendKeys("Description");
        driver.findElementById("createContactForm_importantNote").sendKeys("Note");
        driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("044");
        driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("044");
        driver.findElementById("createContactForm_primaryEmail").sendKeys("shan@gmail.com");        
        driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9789387757");
        driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Gayathri");
        driver.findElementById("generalToNameField").sendKeys("toname");
        driver.findElementById("createContactForm_generalAddress1").sendKeys("address1");        
        driver.findElementById("createContactForm_generalCity").sendKeys("chennai");
        driver.findElementById("createContactForm_generalPostalCode").sendKeys("641026");
        driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("045");
        driver.findElementById("createContactForm_generalAttnName").sendKeys("Shenba");
        driver.findElementById("createContactForm_generalAddress2").sendKeys("Address2");
        WebElement country =driver.findElementById("createContactForm_generalCountryGeoId");
        Select s1 = new Select(country);
        s1.selectByVisibleText("India");
        WebElement state =driver.findElementById("createContactForm_generalStateProvinceGeoId");
        Select stateObj = new Select(state);
        stateObj.selectByVisibleText("TAMILNADU");
        driver.findElementByXPath("//input[@class='smallSubmit']").click();
        WebElement firtsname = driver.findElementById("viewContact_firstName_sp");
        String fname = firtsname.getText();
        if(fname.equalsIgnoreCase("Shanmuga lakshmi"))
		{
			System.out.println("First name Matched");
		}
		else
		{
			System.out.println("Not matched");
			
		}
        driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
        WebElement marketingCompain =driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
        Select marCompain = new Select(marketingCompain);
        marCompain.selectByVisibleText("Catalog Generating Marketing Campaigns");
        driver.findElementByXPath("//input[@ value='Add']").click();
        driver.findElementByXPath("//input[@ value='Update']").click();
        WebElement marCompaign = driver.findElementById("viewContact_marketingCampaigns_sp");
        String marCom = marCompaign.getText();
        if(marCom.equalsIgnoreCase("Catalog Generating Marketing Campaigns"))
		{
			System.out.println("comapaign Matched");
		}
		else
		{
			System.out.println("Not matched");
			
		}        
   
	}
	

}
