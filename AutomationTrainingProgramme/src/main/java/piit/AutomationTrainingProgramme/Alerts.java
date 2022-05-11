package piit.AutomationTrainingProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ather\\eclipse-workspace\\AutomationTrainingProgramme\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		  driver.manage().window().maximize();
	WebElement Alert=driver.findElement(By.name("alert"));
	Alert.click();
	Thread.sleep(6000);
	driver.switchTo().alert().accept();
	WebElement Confirmationbox=driver.findElement(By.name("confirmation"));
	Confirmationbox.click();
	Thread.sleep(6000);
	driver.switchTo().alert().accept();
	WebElement Prompting=driver.findElement(By.name("prompt"));
	Prompting.click();
	Thread.sleep(6000);
	driver.switchTo().alert().sendKeys("testing");
	driver.switchTo().alert().dismiss();
	
	
	
	
	
	
	
	
	}















}
