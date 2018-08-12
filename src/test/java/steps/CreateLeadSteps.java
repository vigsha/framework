package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	public RemoteWebDriver driver;

	@Given("launchBrowser")
	public  void  openTheBrowser(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
	}
	@And("maximizethepage")
	public void maximizeThePage() {
		driver.manage().window().maximize();
	}
	@And("load the URL")
	public void enterUrl() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Set the Timeout")
	public void timeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Enter the user name as (.*)")
	
	public void enterUserName(String uNmae)
	{
		driver.findElementById("username").sendKeys(uNmae);
	}
	@And("Enter the password as (.*)")
	public void enterPassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}
	@And("click on the login button")
	public void clickOnLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click on CRMSFA link")
	public void clickCrmsfaLink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("click on createlead menu")
	public void clickOnCreateLeadButton()
	{
		driver.findElementByLinkText("Create Lead").click();
		
	}
	@And("Enter the compnyName as (.*)")
	public void enterCompanyName(String cName)
	{
	
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	@And("Enter the firstName as (.*)")
	public void enterFirstname(String fName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	@And("Enter theLastname (.*)")
	public void enterLastName(String lName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	@When("click on CreateLeadButton")
	public void clickCreateLeadButton() {
	
	driver.findElementByClassName("smallSubmit").click();
	}	
	
	@Then("close the browser")
	public void closeBrowser() {
		
		driver.close();
		}	
		
	
	

}
