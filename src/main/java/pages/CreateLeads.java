package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class CreateLeads extends Annotation {

	public CreateLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement cName ;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement fName ;	
	
	@FindBy(id="createLeadForm_lastName")
	WebElement lName ;
	
	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement phnumber ;
	
	@FindBy(id="createLeadForm_primaryEmail")
	WebElement email ;
	
	@FindBy(xpath = "//ul[@class='errorList']")
	WebElement eleerrmsg ;
	
	
	@FindBy(className="smallSubmit")
	WebElement eleSubmit;
	
	
	public CreateLeads CompanyName(String CompanyName)
	{
		type(cName,CompanyName);
		return this;
	}
	
	
	public CreateLeads FirstName(String FirstName)
	{
		type(fName,FirstName);
		return this;
	}
	public CreateLeads LastName(String LastName)
	{
		type(lName, LastName);
		return this;
	}
	public CreateLeads PhoneNumber(String PhoneNumber)
	{
		type(phnumber, PhoneNumber);
		return this;
	}
	
	public CreateLeads MailID(String MailID)
	{
		type(email, MailID);
		return this;
	}
	/*public ViewLeads clickSubmit()
	{
		click(eleSubmit);
		return new ViewLeads();
	}
	*/
	public CreateLeads clickSubmit()
	{
		click(eleSubmit);
		return this;
	}
	
	
	
	public CreateLeads verifyErrMsg(String errmsg)
	{
		verifyExactText(eleerrmsg, errmsg);
		return this;
	}
	
	public CreateLeads verifyfname(String Firstname)
	{
		verifyExactText(fName, Firstname);
		return this;
	}


	}


