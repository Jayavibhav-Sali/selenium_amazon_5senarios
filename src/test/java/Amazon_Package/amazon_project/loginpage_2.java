package Amazon_Package.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_2 {
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continue_button;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement submit;
	
	
	public void us_input() {
		username.sendKeys("7892733234");	
		
	}
	
	public void cnt_button() {
		continue_button.click();	
		
	}
	
	public void pass_input() {
		password.sendKeys("Jai@220011");		
	}

	public void subt_button() {
		submit.click();
	}
	
	public loginpage_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
