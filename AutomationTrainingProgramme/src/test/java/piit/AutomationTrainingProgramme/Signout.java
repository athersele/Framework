package piit.AutomationTrainingProgramme;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import junit.framework.Assert;
import m.common.Utility;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Signout extends Utility {

  @Test(priority = 1)
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.Email();
	  
	  Pictures();
	  ob.PsswordFieldsEnters();
	  Thread.sleep(6000);
	  
	  Pictures();
	  Thread.sleep(6000);
	  ob.ForgotLinkClick();
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  id.IdsSendKeys();
	  
	  Pictures();
	  id.SearchButtonClick();
	  Thread.sleep(6000);  

	    
	  
  }
   @Test(priority = 2,dependsOnMethods = "f")
   public void TextVerificationMethod() throws InterruptedException {
	 driver.navigate().back();
	 Thread.sleep(6000);
	 ForgotPasswordPage id=new ForgotPasswordPage(driver);
	 String Questions=id.QuestionOfText();
	 SoftAssert softit=new SoftAssert();
	 softit.assertEquals("Please enter your email or mobile number  search for your account.", Questions);  //this will fail the test because "to" between number and search is missing.
	 System.out.println("This is after assertion");
	 softit.assertAll();  //make sure to use this so the results show which test failed.
	 
   }
   @Test(priority = 3)
   public void TextVerificationAgain() throws InterruptedException {
	   driver.navigate().back();
	   Thread.sleep(6000);
	   ForgotPasswordPage id=new ForgotPasswordPage(driver);
	   String Connect=id.ConnectText();
	   Assert.assertEquals("Connect with friends and the world around you on Facebook.", Connect);
   }
   
  
 
  }

 
  

