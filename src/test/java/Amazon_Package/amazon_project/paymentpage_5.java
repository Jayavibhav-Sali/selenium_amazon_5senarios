package Amazon_Package.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentpage_5 {
	

	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_buy;
	
	@FindBy(xpath="//span[@id='checkout-primary-continue-button-id']")
	WebElement usethispaymentmethod;
	
	@FindBy(xpath="(//span[@data-action='page-transit-no-update-action'])[7]")
	WebElement revieworder;
	
	@FindBy(xpath="(//input[@id='placeOrder'])[3]")
	WebElement placeorder;
	
	
	
	public void buyproduct() {
		proceed_to_buy.click();
		
	}
	
	public void usepayment() {
		usethispaymentmethod.click();
	}
	
	public void revieworder() throws InterruptedException {
		Thread.sleep(5000);
		revieworder.click();
	}
	
	public void placeorder() throws InterruptedException {
		Thread.sleep(2000);
		placeorder.click();
	}
	
	
	public paymentpage_5(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
