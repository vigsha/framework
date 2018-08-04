package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Hold_Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.findElementByXPath("//a[contains(text(),'Selectable')]").click();
		WebElement eleframe  = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleframe);
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']//li[1]");
        WebElement item2 = driver.findElementByXPath("//ol[@id='selectable']//li[4]");
        Actions builder = new Actions(driver);
        builder.clickAndHold(item1).release(item2).perform();
		
	}

}
