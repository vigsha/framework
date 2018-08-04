package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class ComplexProject extends SeMethods {
  @Test
	public void flipkart() {
		// TODO Auto-generated method stub
		startApp("chrome","https://www.flipkart.com");
		WebElement eleClose = locateElement("xpath","//button[text()='✕']");
		click(eleClose);
		WebElement eleTv=locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement eleSamsung=locateElement("xpath","//span[text()='Samsung']//following::span[text()='Samsung']");
		mouseOver(eleTv,eleSamsung);
		WebElement minValue = locateElement("xpath","//select[@class='fPjUPw']");
		selectDropDownUsingText(minValue,"₹25000");
		WebElement maxValue = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingText(maxValue,"₹60000");
		WebElement eleScreenSize = locateElement("xpath","//div[contains(text(),'Screen Size')]");
		click(eleScreenSize);	
		waiting(2000);
		WebElement eleScreenSizeVal = locateElement("xpath","//div[contains(text(),'48 - 55')]");
		click(eleScreenSizeVal);
		waiting(4000);
		WebElement eleFirstProduct = locateElement("xpath","//div[@class='_3wU53n'][1]");
		click(eleFirstProduct);
		switchToWindow(1);
		waiting(3000);
		WebElement compareClick = locateElement("xpath","//div[@class='_1p7h2j']");
		click(compareClick);
		closeBrowser();
		switchToWindow(0);
		WebElement secProduct = locateElement("xpath","//div[@class='_3wU53n'][1]/following::div[@class='_3wU53n'][1]");
		click(secProduct);
		switchToWindow(1);
		WebElement compareClick1 = locateElement("xpath","//div[@class='_1p7h2j']");
		click(compareClick1);
		WebElement compareButton = locateElement("xpath","//a[@class='_1h5zc_ sTOdGz']");
		click(compareButton);
	    WebElement price1 = locateElement("xpath","//div[@class='_1vC4OE']");
	    String text = price1.getText();
	    String replace = text.replace("₹", "").replace(",", "");
	    int price1AfterConvertion = Integer.parseInt(replace);
		WebElement price2 = locateElement("xpath","//div[@class='_1vC4OE']//following::div[@class='_1vC4OE']");
		String text2 = price2.getText();
		String replace1 = text2.replace("₹", "").replace(",", "");
		int price2AfterConvertion = Integer.parseInt(replace1);
		WebElement buy1 = locateElement("xpath","//*[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']");		
		WebElement buy2 = locateElement("xpath","//*[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']//following::*[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']");				
		if(price1AfterConvertion>price2AfterConvertion) {
			System.out.println("Lowest price"+price2AfterConvertion);
			click(buy2);
			waiting(3000);
		}
		else {
			System.out.println("highiest price"+price1AfterConvertion);
			click(buy1);
			waiting(3000);
		}	
		
		closeAllBrowsers();
			
		}		
	}


