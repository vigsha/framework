package week3.day1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopupProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/");
        driver.findElementByXPath("//a[contains(text(),'Multi-PopUp Test #2')]").click();
        Thread.sleep(5000);
        Set<String> allWindowHandle = driver.getWindowHandles();
		List<String> listOfAllWinHandle = new ArrayList<String>();
		listOfAllWinHandle.addAll(allWindowHandle);
		driver.switchTo().window(listOfAllWinHandle.get(1));
		driver.close();
		driver.switchTo().window(listOfAllWinHandle.get(2));
		driver.close();
		driver.switchTo().window(listOfAllWinHandle.get(3));
		driver.close();
		driver.switchTo().window(listOfAllWinHandle.get(0));
		System.out.println(driver.getTitle());
	}
	

}
