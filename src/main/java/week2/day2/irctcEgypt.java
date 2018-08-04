package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctcEgypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement country =driver.findElementById("userRegistrationForm:countries");
        Select cou = new Select(country);
       // cou.selectByVisibleText("India");
        List<WebElement> option = cou.getOptions();
        for(WebElement eachoption:option)
        if (eachoption.getText().startsWith("E"))
        {
        	i++;
        	if(i==2)
        	{
        		System.out.println(eachoption.getText());
        		eachoption.click();
        	}
        }
	}

}
