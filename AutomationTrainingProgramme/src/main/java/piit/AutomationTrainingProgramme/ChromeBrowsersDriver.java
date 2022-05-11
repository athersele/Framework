package piit.AutomationTrainingProgramme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowsersDriver {
static WebDriver driver;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ather\\eclipse-workspace\\AutomationTrainingProgramme\\Drivers\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.navigate().to("https://www.amazon.com");
  driver.manage().window().maximize();
  driver.navigate().back();
  Thread.sleep(6000);
  driver.navigate().forward();
  driver.navigate().refresh();
  String ur=driver.getCurrentUrl();
  System.out.println(ur);
  String windowhandle=driver.getWindowHandle();
  System.out.println(windowhandle);
  driver.close();
  
	
	
	
	
	
	
	
	
	
	}

}
