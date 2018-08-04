package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelectedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		WebElement checkbox = driver.findElementByXPath("//label[contains(text(),'Confirm Selenium is checked')]//following::input[1]");
		System.out.println("The checkbox confirm seleniume is checked - " + checkbox.isSelected());
		if(!checkbox.isSelected())
			checkbox.click();
		
	}

}
