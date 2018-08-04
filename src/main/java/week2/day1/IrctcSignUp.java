package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");	
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:userName").sendKeys("Vignesh");
		driver.findElementById("userRegistrationForm:password").sendKeys("Vigsha@268");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Vigsha@268");
		WebElement securityQuestion =driver.findElementById("userRegistrationForm:securityQ");
        Select sq = new Select(securityQuestion);
        sq.selectByVisibleText("What is your pet name?");
        driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("vicky");
        driver.findElementById("userRegistrationForm:firstName").sendKeys("Vignesh");
        driver.findElementById("userRegistrationForm:lastName").sendKeys("R");
        driver.findElementById("userRegistrationForm:gender:0").click();
        driver.findElementById("userRegistrationForm:maritalStatus:0").click();
        WebElement dobDay =driver.findElementById("userRegistrationForm:dobDay");
        Select dobd = new Select(dobDay);
        dobd.selectByVisibleText("23");
        WebElement dobMonth =driver.findElementById("userRegistrationForm:dobMonth");
        Select dobm = new Select(dobMonth);
        dobm.selectByVisibleText("MAR");
        WebElement dobYear =driver.findElementById("userRegistrationForm:dateOfBirth");
        Select doby = new Select(dobYear);
        doby.selectByVisibleText("1989");
        WebElement occupation =driver.findElementById("userRegistrationForm:occupation");
        Select occ = new Select(occupation);
        occ.selectByVisibleText("Private");
        WebElement country =driver.findElementById("userRegistrationForm:countries");
        Select cou = new Select(country);
        cou.selectByVisibleText("India");
        driver.findElementById("userRegistrationForm:email").sendKeys("vicky@gmail.com");
        driver.findElementById("userRegistrationForm:mobile").sendKeys("7299122200");
        WebElement nationality =driver.findElementById("userRegistrationForm:nationalityId");
        Select nat = new Select(nationality);
        nat.selectByVisibleText("India");
        driver.findElementById("userRegistrationForm:address").sendKeys("245");
        driver.findElementById("userRegistrationForm:pincode").sendKeys("600097",Keys.TAB);
        Thread.sleep(5000);
        WebElement city =driver.findElementById("userRegistrationForm:cityName");
        Select cit = new Select(city);
        cit.selectByVisibleText("Kanchipuram");
        Thread.sleep(5000);
        driver.findElementById("userRegistrationForm:cityName").sendKeys(Keys.TAB);
        WebElement po = driver.findElementById("userRegistrationForm:postofficeName");
        Select pno = new Select(po);
        pno.selectByVisibleText("Karapakkam S.O");
        Thread.sleep(2000);        
        driver.findElementById("userRegistrationForm:landline").sendKeys("0463222551");        
	}

}
