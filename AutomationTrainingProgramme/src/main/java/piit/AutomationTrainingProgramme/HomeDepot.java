package piit.AutomationTrainingProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ather\\eclipse-workspace\\AutomationTrainingProgramme\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.homedepot.com");
		  driver.manage().window().maximize();
		  WebElement MyAccount=driver.findElement(By.id("headerMyAccount"));
		 MyAccount.click();
		 WebElement RegisterMyAccount=driver.findElement(By.id("SPSORegister"));
		 RegisterMyAccount.click();
		 Thread.sleep(6000);
		 WebElement personalaccount=driver.findElement(By.xpath("//*[text()='Select & Continue']"));
		 personalaccount.click();
		 Thread.sleep(6000);
		 WebElement emailaddress=driver.findElement(By.id("email"));
		 emailaddress.sendKeys("ather_tahir@live.com");
		 Thread.sleep(6000);
		 WebElement Password=driver.findElement(By.id("password-input-field"));
		 Password.sendKeys("Atest21");
		 Thread.sleep(6000);
		 WebElement Zipcode=driver.findElement(By.id("zipCode"));
		 Zipcode.sendKeys("21030");
		 Thread.sleep(6000);
		 WebElement PhoneNumber=driver.findElement(By.id("phone"));
		 PhoneNumber.sendKeys("2028178507");
		 Thread.sleep(6000);
		 WebElement KeepMeSignedIn=driver.findElement(By.xpath("//*[text()=\"Keep me signed in\"]"));
		 KeepMeSignedIn.click();
		 WebElement VerifyMobile=driver.findElement(By.xpath("//*[@for='verify-phone-checkbox']"));
		 VerifyMobile.click();
		 Thread.sleep(6000);
		 WebElement Robot=driver.findElement(By.id("recaptcha-anchor"));
		 Robot.click();
		 Thread.sleep(6000);
		 WebElement createaccount=driver.findElement(By.xpath("//*[@class='bttn__content']"));
		 createaccount.click();
		 
		 
		 
		 
		 
		 
		 
		 
		  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
