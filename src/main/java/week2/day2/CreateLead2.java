package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead2 {

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
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("ShanmugaLakshmi");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Laks");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("k");
		WebElement source =driver.findElementById("createLeadForm_dataSourceId");
        Select s = new Select(source);
        s.selectByVisibleText("Employee");
        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("title");
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("500000");
        WebElement Industry =driver.findElementById("createLeadForm_industryEnumId");
        Select dd = new Select(Industry);
        dd.selectByVisibleText("Insurance"); 
        WebElement ownerShip =driver.findElementById("createLeadForm_ownershipEnumId");
        Select own = new Select(ownerShip);
        own.selectByVisibleText("Partnership");
        driver.findElementById("createLeadForm_sicCode").sendKeys("12345");
        driver.findElementById("createLeadForm_description").sendKeys("Description");
        driver.findElementById("createLeadForm_importantNote").sendKeys("Notes");
        driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("6");
        driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
        driver.findElementById("createLeadForm_departmentName").sendKeys("department");
        WebElement currency =driver.findElementById("createLeadForm_currencyUomId");
        Select cy = new Select(currency);
        cy.selectByVisibleText("INR - Indian Rupee");
        driver.findElementById("createLeadForm_tickerSymbol").sendKeys("A");
        driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
        driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("security");
        driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.weburl.com");
        driver.findElementById("createLeadForm_generalToName").sendKeys("ToName");
        driver.findElementById("createLeadForm_generalAddress1").sendKeys("add 1");
        driver.findElementById("createLeadForm_generalAddress2").sendKeys("add 2");
        driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
        WebElement country =driver.findElementById("createLeadForm_generalCountryGeoId");
        Select cou = new Select(country);
        cou.selectByVisibleText("India");
        Thread.sleep(2000);
        driver.findElementById("createLeadForm_generalPostalCode").sendKeys("12345");
        driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("67890");
        WebElement state =driver.findElementById("createLeadForm_generalStateProvinceGeoId");
        Select code = new Select(state);
        code.selectByVisibleText("TAMILNADU");  
        Thread.sleep(2000);
        WebElement compaign =driver.findElementById("createLeadForm_marketingCampaignId");
        Select com = new Select(compaign);
        com.selectByVisibleText("Automobile");
        Thread.sleep(2000);
        driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9894298697");
        driver.findElementById("createLeadForm_primaryEmail").sendKeys("shan@gmail.com");
        driver.findElementByClassName("smallSubmit").click();
        }

}
