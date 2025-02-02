package Amazon_Package.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	
	@FindBy(linkText="View Your List")
	WebElement viewyour_list;
	
	@FindBy(xpath="//input[@name='submit.deleteItem']")
	WebElement remove_item;
	
	
	public void viewlist() {
		viewyour_list.click();
	}
	
	public void removeitem() {
		remove_item.click();
	}
	
	
	
	public WishListPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

}
