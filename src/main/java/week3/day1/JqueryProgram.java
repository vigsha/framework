package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
        driver.findElementByXPath("//a[contains(text(),'Draggable')]").click();
        WebElement frameEle = driver.findElementByClassName("demo-frame");
        driver.switchTo().frame(frameEle);
        WebElement text = driver.findElementByXPath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']/p");
        String result =text.getText();
        System.out.println(result);
        driver.switchTo().defaultContent();
        driver.findElementByXPath("//a[contains(text(),'Droppable')]").click();
	}

}
