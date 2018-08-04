package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesW3schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
		Alert myAlert=driver.switchTo().alert();		
		System.out.println(myAlert.getText());
		myAlert.sendKeys("Buddies");
		myAlert.accept();		
		WebElement welcome=driver.findElementById("demo");
		String result = welcome.getText();
		if(result.contains("Buddies"));
		System.out.println("verified");
		driver.switchTo().defaultContent();
		//driver.close();
		driver.findElementByXPath("//div[@class='w3-bar w3-light-grey']//following::a").click();
		Set<String> allWindowHandle=driver.getWindowHandles();
		List<String> listofAllWindowHandle=new ArrayList<String>();
		listofAllWindowHandle.addAll(allWindowHandle);
		driver.switchTo().window(listofAllWindowHandle.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listofAllWindowHandle.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
