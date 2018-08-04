package wdMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporters;

public class SeMethods extends Reporters implements WdMethods{
	public static RemoteWebDriver driver ;
	public static Properties prop;
	int i = 1;
	public void loadObject() throws FileNotFoundException, IOException
	{
		prop = new Properties();
		prop.load(new FileInputStream("./src/main/resources/object.properties"));
	}
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				 driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);System.out.println("The Browser "+browser+" is Launched Successfully");
			
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver exception occured");
			
			e.printStackTrace();
		}		
		finally 
		{
		takeSnap();
		}
		
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "link" : return driver.findElementByLinkText(locValue);
			case "name" : return driver.findElementByName(locValue);
			}
		} 
		catch (NoSuchElementException e) {
		System.err.println("No such element exception occured");
		}
		
		finally {
		takeSnap();
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		
		try {
			 return driver.findElementById(locValue);
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		System.err.println("No such element exception occured");
		}
		finally {
		 takeSnap();
		}
		return null;
		 		 
	}

	public void type(WebElement ele, String data) throws NullPointerException {
		
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Webdriver exception has occured");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}
	}

	public void click(WebElement ele) {
	try {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		System.err.println("No such element exception occured");
	}
	finally {
	takeSnap();		
	}
	}
	
	public void clickWithoutSnap(WebElement ele) {
	ele.click();
	System.out.println("The Element "+ele+" is clicked Successfully");	
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		
		try {
			
			String text = ele.getText();
			System.out.println(text);
			return text;
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		System.err.println("No such Element Exception has occured");
		}
		finally {
		takeSnap();
		}
		return null;
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select sel= new Select(ele);
			sel.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such Element Exception has occured");
		}
		finally {
		takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		try {
			Select selindex=new Select(ele);
			selindex.selectByIndex(index);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such Element Exception has occured");
		}
		finally {
		takeSnap();
		}
	}
	
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select selvalue=new Select(ele);
			selvalue.selectByValue(value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such Element Exception has occured");
		}
		finally{
		takeSnap();
	}}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		try {
			boolean bReturn = false;
			if(driver.getTitle().equals(expectedTitle)) 
			{
				System.out.println("Title is matched");
				bReturn = true;
			}
			else {
				System.out.println("Title is not matched");
			}
			return bReturn;
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Webdriver exception has occured");
		}
		finally
		{
		takeSnap();
		}
		
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		
		try {
			if(ele.getText().equals(expectedText))
			{
				System.out.println("The value" + expectedText + "is matched");			
			}
			else {
				System.out.println("The value" + expectedText + "not matched");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such element exception has occured");
		}
		finally
		{
		takeSnap();
		}
		
		}
	

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try {
			if(ele.getText().contains(expectedText))
			{
				System.out.println("The value" + expectedText + "is matched");	
				takeSnap();
			}
			else {
				System.out.println("The value" + expectedText + "not matched");
				takeSnap();
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such element exception has occured");
		}
			
		}
	

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
		try {
			if(ele.getAttribute(attribute).equals(value))
					{
				System.out.println("The value" + value + "is matched");		
				    }
					else {
						System.out.println("The value" + value + "not matched");
					}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such element exception has occured");
		}
		finally {
		takeSnap();
		}
		}
		

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
		try {
			String val =ele.getAttribute(attribute);
			if (val.equalsIgnoreCase(value)) {
				System.out.println("The given "+value+" is partially Matched");
				

			} else {
				System.out.println("The given "+value+" not partially Matched");

			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such element exception has occured");
			
		}
		finally {
			takeSnap();
		}
		}


	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			ele.isSelected();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		takeSnap();
		
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
		ele.isDisplayed();
		takeSnap();
		
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> listOfWindows= new ArrayList<String>();
			listOfWindows.addAll(allWindows);
			driver.switchTo().window(listOfWindows.get(index ));
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("NoSuchWindowException has occured");
		}		
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
		driver.switchTo().frame(ele);
		
		takeSnap();
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub		
		Alert alertvalue = driver.switchTo().alert();
		alertvalue.getText();
		alertvalue.accept();
	
		}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		Alert alertvalue = driver.switchTo().alert();
		alertvalue.getText();
		alertvalue.dismiss();
	
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		Alert alertvalue = driver.switchTo().alert();
		alertvalue.getText();
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	public void waiting(int value) 
	{
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void mouseOver(WebElement ele1,WebElement ele2) 
	{
	
			Actions builder = new Actions(driver);
			builder.moveToElement(ele1).pause(3000).click(ele2).perform();
		} 
	

}
