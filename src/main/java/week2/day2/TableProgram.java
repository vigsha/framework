package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		List<WebElement> NoOfRows = driver.findElementsByXPath("//section[@class='innerblock']//table/tbody/tr");
		int rowscount =NoOfRows.size();
	    System.out.println(rowscount);
	    String value=driver.findElementByXPath("//tbody/tr[3]/td[2]").getText();
	    System.out.println(value);     
	    }

}
