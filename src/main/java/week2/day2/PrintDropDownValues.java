package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement country =driver.findElementById("userRegistrationForm:countries");
        Select cou = new Select(country);
       List<WebElement> alloptions = cou.getOptions();
       for (WebElement eachoption : alloptions)
		{
       System.out.println(eachoption.getText());
		}
        
        
        
	}

}
