package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotation;
public class MergeLead extends Annotation {
 //@Test (enabled= false)
	@Test(groups= {"Regression"})
	public void lead() throws InterruptedException {
		// TODO Auto-generated method stub
		
	    WebElement leads = locateElement("link","Leads");
	    click(leads);
	    WebElement mergeLeads = locateElement("link","Merge Leads");
	    click(mergeLeads);
	    WebElement fromLeadIcon = locateElement("xpath","//table[@class='dijit dijitReset dijitInline dijitLeft  dijitComboBoxNoArrow']/following::a");
	    click(fromLeadIcon);
	    switchToWindow(1);
	    WebElement leadID = locateElement("name","id");
	    type(leadID,"10226");
	    WebElement findLead = locateElement("xpath","//button[contains(text(),'Find Leads')]");
	    click(findLead);
	    Thread.sleep(3000);
        WebElement fromLeadLink = locateElement("xpath","//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
        clickWithoutSnap(fromLeadLink);
	    switchToWindow(0);
	    WebElement toLeadIcon = locateElement("xpath","//table[@class='dijit dijitReset dijitInline dijitLeft  dijitComboBoxNoArrow']/following::img");
	    click(toLeadIcon);
	    switchToWindow(1);
	    WebElement leadID1 = locateElement("name","id");
	    type(leadID1,"10227");
	    WebElement findLead1 = locateElement("xpath","//button[contains(text(),'Find Leads')]");
	    click(findLead1);
	    Thread.sleep(2000);
	    WebElement toLeadLink = locateElement("xpath","//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
	    clickWithoutSnap(toLeadLink);
	    switchToWindow(0);	    
	    WebElement merge = locateElement("class","buttonDangerous");
	    clickWithoutSnap(merge);
	    acceptAlert();
	    WebElement findLead2 = locateElement("xpath","//a[contains(text(),'Find Leads')]");
	    click(findLead2);
	    WebElement leadID2 = locateElement("name","id");
	    type(leadID2,"10226");
	    WebElement findLead3 = locateElement("xpath","//button[contains(text(),'Find Leads')]");
	    click(findLead3);
	    WebElement verify = locateElement("xpath","//div[@class='x-panel-bbar']//div[@class='x-paging-info']");
	    verifyExactText(verify,"No records to display");        
        
	}

	

}
