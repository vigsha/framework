package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElementByXPath("//button[contains(text(),'Close Me')]").click();	
		WebElement frameEle = driver.findElementById("childIframe");
		driver.switchTo().frame(frameEle);
		driver.findElementByXPath("//button[contains(text(),'Close Me')]").click();
		driver.findElementByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']/p//button[contains(text(),'Close Me')]").click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']/p//button[contains(text(),'Close Me')]").click();
		Thread.sleep(4000);
		driver.close();	
		
	}

}
