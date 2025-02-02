package Amazon_Pages_Source;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.edge.EdgeDriver;


public class HomePage_1 {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement hower_over;

	@FindBy(linkText="Sign in")
	WebElement sign_in;
	
	
	@FindBy(linkText="Sign Out")
	WebElement sign_out;
	
	
	public void hoverover(WebDriver driver) {
		
		Actions ac= new Actions(driver);	
		ac.moveToElement(hower_over).perform();
		
	}
	
	
	public void signin_button(WebDriver driver) {
		sign_in.click();
	}
	
	public void signout_button(WebDriver driver) {
		sign_out.click();
	}
	
	
	public HomePage_1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
}

	
