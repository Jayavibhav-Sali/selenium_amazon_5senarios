package Amazon_Package.amazon_project;

import java.util.Iterator;

import java.util.Set;

// Login to amazon->search a product->


//add it to wishlist->add it to cart->Make a paymnet using COD->logout			

import org.testng.annotations.Test;

public class test_1_amazonproduct_booking extends Launchandquit{
	
	@Test
	public void test1() throws InterruptedException {
		
		driver.navigate().to("https://www.amazon.in");
		
		homepage_1 hmt= new homepage_1(driver);
		hmt.signin_button();
		
		loginpage_2 lgn= new loginpage_2(driver);
		lgn.us_input();
		lgn.cnt_button();
		Thread.sleep(2000);
		lgn.pass_input();
		Thread.sleep(2000);
		lgn.subt_button();
		
		searchresultspage_3 srch= new searchresultspage_3(driver);
		srch.search_product();
		Thread.sleep(2000);
		srch.product_select();
		Thread.sleep(2000);
		srch.multiple_window(driver);
		
  
      
      srch.add_product();
      
      productpage_4 pdct= new productpage_4(driver);
      pdct.add_product();
      
      driver.navigate().back();
      
      logout_6 lgt=new logout_6(driver);
      lgt.hower_over(driver);
      lgt.signout();
      
      
      
      

	}
	
	
	
	

}
