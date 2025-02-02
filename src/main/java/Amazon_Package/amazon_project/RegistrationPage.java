package Amazon_Package.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	@FindBy(xpath="//input[@placeholder='First and last name']")
	WebElement new_user1stname;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	WebElement new_pwd1stname;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement verify_mobile_element;
	
	public void new_username() {
		new_user1stname.sendKeys("Lktn nn");
		
	}
	
	public void new_passwrd() {
		new_pwd1stname.sendKeys("Jt@23444");
		
	}
	
	public void verify_mobile() {
		verify_mobile_element.click();
		
	}
	
	public RegistrationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

}
