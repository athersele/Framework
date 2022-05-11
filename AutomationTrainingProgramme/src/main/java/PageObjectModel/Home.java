package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;
	@FindBy(name="email") WebElement Ids;
	@FindBy(name="pass") WebElement Psswords; //name should be pass. used passit to show failed result on dependency of 2nd test.
	@FindBy(linkText="Forgot password?") WebElement Forgot;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	
	
	public void Email( ) {
		Ids.sendKeys("John");
		
	}
	
	public void PsswordFieldsEnters() {
		Psswords.sendKeys("silver");
	}
	
	public void ForgotLinkClick() {
		Forgot.click();
		
	}
	
	
	
}




