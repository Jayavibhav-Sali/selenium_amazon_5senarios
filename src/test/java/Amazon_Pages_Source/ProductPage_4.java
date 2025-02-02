package Amazon_Pages_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage_4 {
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement addproduct;
	
	
	
	public void add_product() {
		addproduct.click();
		
	}	
	
		public ProductPage_4(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}

}
