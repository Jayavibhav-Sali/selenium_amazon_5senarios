package Amazon_Package.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
	
	//1. addtocrt 2.increasing arrow and select 3. and 3rd.delete
	
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	
	@FindBy(xpath="//select[@class='a-native-dropdown a-declarative sc-update-quantity-select ewc-quantity']")
	WebElement select_dropdown;
	
	@FindBy(xpath="//button[@title='Delete']")
	WebElement delete_item;
	
	
	public void addcart() {
		addtocart.click();
		
	}
	
	public void select_options() {
		
		Select sc= new Select(select_dropdown);
		sc.selectByIndex(3);
	}
	
	public void deleteitem() {
		delete_item.click();
	}
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
