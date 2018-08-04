package week3.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameIdentification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		Thread.sleep(3000);		
		List<WebElement> frameCount = driver.findElementsByTagName("iframe");
		System.out.println("frame counts"+frameCount.size());

	}

}
