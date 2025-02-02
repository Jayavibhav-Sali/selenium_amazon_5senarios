package Amazon_Package.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage_1 {
	
	
	
	@FindBy(linkText="Sign in")
	WebElement sign_in;
	
	
	public void signin_button() {
		sign_in.click();
	}
		
	public homepage_1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}
