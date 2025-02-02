package Amazon_Package.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage_4 {
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceedtobuy;
	
	
	
	public void add_product() {
		proceedtobuy.click();
		
	}	
	
	
		public productpage_4(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		

}
