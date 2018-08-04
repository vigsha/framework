package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MediumProjectSeMethod extends SeMethods {
	@Test

	public void CreateContact() {
		// TODO Auto-generated method stub		
			startApp("chrome","http://leaftaps.com/opentaps");
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, "DemoSalesManager");
			WebElement elePassword = locateElement("id","password");
			type(elePassword, "crmsfa");
			WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleLogin);
			WebElement crmsfa = locateElement("link","CRM/SFA");
		    click(crmsfa);
		    WebElement createContact = locateElement("link","Create Contact");
			click(createContact);
			WebElement firstName = locateElement("id","firstNameField");
			type(firstName,"Shanmuga lakshmi");
			WebElement lastName = locateElement("id","lastNameField");
			type(lastName,"vignesh");
			WebElement firstNamelocal=locateElement("id","createContactForm_firstNameLocal");
			type(firstNamelocal,"Guga");
			WebElement LasttNamelocal=locateElement("id","createContactForm_lastNameLocal");
			type(LasttNamelocal,"Priya");
			WebElement title=locateElement("id","createContactForm_personalTitle");
			type(title,"Mrs");
			WebElement proTitle=locateElement("id","createContactForm_generalProfTitle");
			type(proTitle,"title");
			WebElement dept=locateElement("id","createContactForm_departmentName");
			type(dept,"department");
			WebElement currency = locateElement("id","createContactForm_preferredCurrencyUomId");
			selectDropDownUsingText(currency,"INR - Indian Rupee");			
			WebElement description=locateElement("id","createContactForm_description");
			type(description,"Description");
			WebElement note=locateElement("id","createContactForm_importantNote");
			type(note,"Note");
			WebElement areaCode=locateElement("id","createContactForm_primaryPhoneAreaCode");
			type(areaCode,"044");
			WebElement ext=locateElement("id","createContactForm_primaryPhoneExtension");
			type(ext,"055");
			WebElement email=locateElement("id","createContactForm_primaryEmail");
			type(email,"shan@gmail.com");
			WebElement phNum=locateElement("id","createContactForm_primaryPhoneNumber");
			type(phNum,"9789387757");
			WebElement personToAsk=locateElement("id","createContactForm_primaryPhoneAskForName");
			type(personToAsk,"Gayathri");
			WebElement toName=locateElement("id","generalToNameField");
			String toNameText = toName.getText();
			verifyExactText(toName,toNameText);			
			WebElement add1=locateElement("id","createContactForm_generalAddress1");
			type(add1,"Address1");
			WebElement city=locateElement("id","createContactForm_generalCity");
			type(city,"chennai");
			WebElement postalCode=locateElement("id","createContactForm_generalPostalCode");
			type(postalCode,"641026");
			WebElement postalCodeExt=locateElement("id","createContactForm_generalPostalCodeExt");
			type(postalCodeExt,"045");
			WebElement altName=locateElement("id","createContactForm_generalAttnName");
			type(altName,"Shenba");
			WebElement add2=locateElement("id","createContactForm_generalAddress2");
			type(add2,"Address2");
			WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
			selectDropDownUsingText(country,"India");
			waiting(3000);
			WebElement stateDD = locateElement("id","createContactForm_generalStateProvinceGeoId");
			selectDropDownUsingText(stateDD,"TAMILNADU");
			WebElement createClick = locateElement("xpath","//input[@class='smallSubmit']");
			click(createClick);
			WebElement firstNameVerify = locateElement("id","viewContact_firstName_sp");
			verifyExactText(firstNameVerify,"Shanmuga lakshmi");			
			WebElement edit = locateElement("xpath","//a[contains(text(),'Edit')]");
			click(edit);
			WebElement marketingDD = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
			selectDropDownUsingText(marketingDD,"Catalog Generating Marketing Campaigns");
			WebElement add = locateElement("xpath","//input[@ value='Add']");
			click(add);
			WebElement update = locateElement("xpath","//input[@ value='Update']");
			click(update);			
			WebElement marcompainVerify = locateElement("id","viewContact_marketingCampaigns_sp");
			verifyExactText(marcompainVerify,"Catalog Generating Marketing Campaigns");			

		

	}

}
