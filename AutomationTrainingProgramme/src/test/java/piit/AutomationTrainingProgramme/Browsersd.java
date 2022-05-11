package piit.AutomationTrainingProgramme;

import org.testng.annotations.Test;

import m.common.Utility;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Browsersd extends Utility {

	@Test//2
  public void f() {
		WebElement ids=driver.findElement(By.name("email"));
		ids.sendKeys("Silem@piit");
		WebElement pssword=driver.findElement(By.name("pass"));
		pssword.sendKeys("johnsilver");
		WebElement loginbutton=driver.findElement(By.name("logim"));
		loginbutton.click();
				
	}				
 
  }


