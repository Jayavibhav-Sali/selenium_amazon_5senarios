package Amazon_Package.amazon_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy(xpath="//input[@name='email']")
	WebElement new_customer_username;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement new_customer_continue;
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continue_button;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement submit;
	
	@FindBy(id="createAccount")
	WebElement create_account;
	
	
	public void new_username(WebDriver driver) {
		new_customer_username.sendKeys("8494859748");
		
	}
	
	public void new_continue(WebDriver driver) {
		new_customer_continue.click();
		
	}
	
	
	public void create_act() {	
		create_account.click();
		
	}
	
	public void us_input() {
		username.sendKeys("7892733234");	
		
	}
	
	public void cnt_button() {
		continue_button.click();	
		
	}
	
	public void pass_input(WebDriver driver) {
		WebDriverWait w1= new WebDriverWait(driver,Duration.ofSeconds(60));
		w1.until(ExpectedConditions.visibilityOf(password)).sendKeys("Jai@220011");
		//password.sendKeys("Jai@220011");	
		
	}

	public void subt_button() {
		submit.click();
	}
		
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
