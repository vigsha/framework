package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInIrctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");	
		driver.findElementByXPath("//a[contains(text(),'Contact Us')]").click();
		
		Set<String> allWindowHandle = driver.getWindowHandles();
		List<String> listOfAllWinHandle = new ArrayList<String>();
		listOfAllWinHandle.addAll(allWindowHandle);		
		driver.switchTo().window(listOfAllWinHandle.get(1));
		System.out.println("Title of compatability window:"+driver.getTitle());
        System.out.println("URL of Compatability Browser window :"+ driver.getCurrentUrl());
        driver.close();
        driver.switchTo().window(listOfAllWinHandle.get(0));
        driver.findElementByXPath("//a[contains(text(),'Compatible Browser')]").click();
        Set<String> allWindowHandle1 = driver.getWindowHandles();
		List<String> listOfAllWinHandle1 = new ArrayList<String>();
		listOfAllWinHandle1.addAll(allWindowHandle1);	
        
        driver.switchTo().window(listOfAllWinHandle1.get(1));
        Thread.sleep(2000);
        System.out.println("Title of contact us window:"+driver.getTitle());
        System.out.println("URL of contact us window :"+ driver.getCurrentUrl()); 
        List<WebElement> list = driver.findElementsByXPath("//div[@class='content_12']/ul/li");
       for (WebElement each : list) 
       {
		System.out.println(each.getText());
	    }
        System.out.println("No of windows"+listOfAllWinHandle.size());
        driver.switchTo().window(listOfAllWinHandle.get(1));
        driver.switchTo().window(listOfAllWinHandle.get(0));
        driver.close();
	}
	

}
