package Amazon_Package.amazon_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_6 {
	
	@FindBy(xpath="(//span[@class='nav-icon nav-arrow'])[2]")
	WebElement howerover;
	
	
	@FindBy(linkText="Sign Out")
	WebElement signout;
	
	
	public void hower_over(WebDriver driver) {
		
		Actions ac = new Actions(driver);
		
	    ac.moveToElement(howerover).perform();
	}
		
	public void signout() {
				
	    signout.click();
	}
	
	public logout_6(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}		

}
