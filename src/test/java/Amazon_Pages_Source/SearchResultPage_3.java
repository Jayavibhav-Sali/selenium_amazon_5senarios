package Amazon_Pages_Source;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage_3 {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-base']")
	List<WebElement> product_lists;
	
	@FindBy(xpath="//span[@id='wishListMainButton']") WebElement wishlistbutton;
	
	@FindBy(xpath="//span[@id='continue-shopping']")
	WebElement continueshopping_button;
	
	@FindBy(xpath="(//div[@id='addToCart_feature_div'])[2]") 
	WebElement addtocart_button;
	
	

	
	public void search_product() {
		search.sendKeys("Batman t-shirts for men"+Keys.ENTER);
		
	}
	
	public void product_select() {
		product_lists.get(7).click();
			
	}
		
	public void multiple_window(WebDriver driver) {
		
		Set<String> pc_ids	=driver.getWindowHandles();
	      //  System.out.println(pc_ids);
	        Iterator<String>  pc_window =  pc_ids.iterator();
	        
	      String parent_window= pc_window.next();
	      String chiild_window= pc_window.next();
	      
	      driver.switchTo().window(chiild_window);
	}
	
	public void wish_list() {
		wishlistbutton.click();
	}
	
	public void continueshopping() {
		continueshopping_button.click();
		
	}
	
	public void addtocart_button(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);		
		addtocart_button.click();
	}
	
	public SearchResultPage_3(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

}
