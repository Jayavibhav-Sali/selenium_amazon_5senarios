package Amazon_Package.amazon_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage_new_Practice {
	
	

	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_buy;
	
	@FindBy(xpath="//span[@id='checkout-primary-continue-button-id']")
	WebElement usethispaymentmethod;
	
	@FindBy(xpath="(//span[@data-action='page-transit-no-update-action'])[7]")
	WebElement revieworder;
	
	@FindBy(xpath="(//input[@value='Place your order'])[1]")
	WebElement placeorder;
	
	
	
	public void buyproduct() {
		proceed_to_buy.click();
		
	}
	
	public void usepayment(WebDriver driver) {
		
		usethispaymentmethod.click();
	
	}
	
	public void revieworder(WebDriver driver) {
		
		WebDriverWait w1= new WebDriverWait(driver,Duration.ofSeconds(90));
		w1.until(ExpectedConditions.elementToBeClickable(revieworder)).click();
		
		driver.navigate().refresh();
		
		revieworder.click();
		
		
	}
	
	public void placeorder(WebDriver driver)   {
		/*
		 * WebDriverWait w2= new WebDriverWait(driver,Duration.ofSeconds(90));
		 * w2.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("(//input[@value='Place your order'])[1]"))).click();
		 */
		driver.navigate().refresh();
		//placeorder.click();
		WebDriverWait w2= new WebDriverWait(driver,Duration.ofSeconds(90));
		driver.navigate().refresh();
		w2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@title='Place your order'])[3]"))).click();
	}
	
	public PaymentPage_new_Practice(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
