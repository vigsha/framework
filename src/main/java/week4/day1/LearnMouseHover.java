package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");		
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement eleElectronics = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement eleApple = driver.findElementByXPath("//span[text()='Apple']");
		Actions builder = new Actions(driver);
		builder.moveToElement(eleElectronics).pause(3000).click(eleApple).perform();	
		
	}

}
