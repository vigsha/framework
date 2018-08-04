package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownLastBeforeOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement lastBeforeOption = driver.findElementById("dropdown3");
		Select dd = new Select(lastBeforeOption);
		int lastbeforedd = dd.getOptions().size();
		dd.selectByIndex(lastbeforedd-2);;
	}

}
