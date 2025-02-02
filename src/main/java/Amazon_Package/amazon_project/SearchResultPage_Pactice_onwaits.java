package Amazon_Package.amazon_project;

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

public class SearchResultPage_Pactice_onwaits {
	
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
	
	public void continueshopping(WebDriver driver) {
		continueshopping_button.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait w1= new WebDriverWait(driver,Duration.ofSeconds(90));
		w1.until(ExpectedConditions.elementToBeClickable(addtocart_button));
		
	}
	
	public void addtocart_button(WebDriver driver)  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait w1= new WebDriverWait(driver,Duration.ofSeconds(90));
	//w1.until(ExpectedConditions.elementToBeClickable(addtocart_button)).click();
		driver.navigate().refresh();
		w1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='addToCart_feature_div'])[2]"))).click();
	    driver.navigate().refresh();
		//addtocart_button.click();
	}
	
	public SearchResultPage_Pactice_onwaits(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
