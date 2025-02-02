package Amazon_Package.amazon_project;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class searchresultspage_3 {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-base']")
	List<WebElement> product_lists;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart;
	

	
	public void search_product() {
		search.sendKeys("ball pen under 10 rs"+Keys.ENTER);
		
	}
	
	public void product_select() {
		product_lists.get(5).click();
			
	}
	
	public void add_product() {
		addtocart.click();
		
	}
	
	public void multiple_window(WebDriver driver) {
		
		Set<String> pc_ids	=driver.getWindowHandles();
	      //  System.out.println(pc_ids);
	        Iterator<String>  pc_window =  pc_ids.iterator();
	        
	      String parent_window= pc_window.next();
	      String chiild_window= pc_window.next();
	      
	      driver.switchTo().window(chiild_window);
	}
	
	
	public searchresultspage_3(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

}
