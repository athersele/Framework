package piit.AutomationTrainingProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropitdown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ather\\eclipse-workspace\\AutomationTrainingProgramme\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
	WebElement createanaccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
	createanaccount.click();
	Thread.sleep(6000);
	WebElement month=driver.findElement(By.name("birthday_month"));
	Select ob=new Select(month);
	ob.selectByValue("10");
	WebElement day=driver.findElement(By.name("birthday_day"));
	Select ob2=new Select(day);
	ob2.selectByVisibleText("21");
	WebElement year=driver.findElement( By.name("birthday_year"));
	Select ob3=new Select(year);
	ob3.selectByVisibleText("1990");
	
	
	
	
	
	
	
	
	}














}
