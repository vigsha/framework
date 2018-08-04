package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[contains(text(),'Droppable')]").click();
		WebElement eleframe  = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleframe);
		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();

	}

}
