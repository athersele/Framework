package piit.AutomationTrainingProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocatored {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ather\\eclipse-workspace\\AutomationTrainingProgramme\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.amazon.com");
		  driver.manage().window().maximize();
		WebElement searchtofield=driver.findElement(By.xpath("//input[@aria-label='Search']"));
		searchtofield.sendKeys("computer");
		  WebElement searchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		  Thread.sleep(6000);
		  searchtoclick.click();
		  
		  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	}


}






