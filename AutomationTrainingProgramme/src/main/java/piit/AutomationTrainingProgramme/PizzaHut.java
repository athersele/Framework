package piit.AutomationTrainingProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaHut {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ather\\eclipse-workspace\\AutomationTrainingProgramme\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.pizzahut.be/nl");
		  driver.manage().window().maximize();
		  //i am out of the country so the website is different
		  WebElement menu=driver.findElement(By.id("category-link-DAILYDEAL"));
		  menu.click(); 
		  WebElement pizza=driver.findElement(By.id("category-link-PIZZA"));
		  pizza.click();
		  //no popular pizza options
		  WebElement cheesepizza=driver.findElement(By.xpath("//img[@alt='MARGHERITA-img']"));
		  cheesepizza.click();
		  WebElement pizzasize=driver.findElement(By.xpath("//div[@role='button'][1]"));
		  pizzasize.click();
		  WebElement addtocart=driver.findElement(By.xpath("//button[@type='submit']"));
		  addtocart.click();
		  WebElement checkout=driver.findElement(By.xpath("//span[@class='c-icn c-icn--normal c-icn--left c-icn--white pzh-icn-lock catalog__confirm-wrapper-lock-icon u-vertical-align--middle"));
		  checkout.click();
		  WebElement deliver=driver.findElement(By.xpath("//p[text()='Levering']"));
		  deliver.click();
		  WebElement address=driver.findElement(By.xpath("//input[@placeholder='Stad, straat']"));
		  address.sendKeys("302 Hasselt, MAASTRICHTERSTEENWEG");
		  WebElement findstore=driver.findElement(By.id("btnHomePageDelivery"));
		  findstore.click();
		  WebElement selectstore=driver.findElement(By.xpath("//button[@type='submit']"));
		  selectstore.click();
		  
	
	
	
	
	
	
	
	
	
	
	
	}

}
