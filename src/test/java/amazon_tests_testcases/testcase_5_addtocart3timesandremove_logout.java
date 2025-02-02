package amazon_tests_testcases;

import org.testng.annotations.Test;

import Amazon_Package.amazon_project.CartPage;
import Amazon_Package.amazon_project.HomePage;
import Amazon_Package.amazon_project.retry_cases;
import Amazon_Pages_Source.LaunchAndQuit_withoutif_condtion;
import Amazon_Pages_Source.LoginPage_2;
import Amazon_Pages_Source.SearchResultPage_3;

//Login to amazon->search a product->add it to cart->
//incrdement its count by 3->remove the product which are presnet in cart->
//logout			

public class testcase_5_addtocart3timesandremove_logout extends LaunchAndQuit_withoutif_condtion {
	
	@Test(retryAnalyzer=retry_cases.class)
	public void tc5_addcart_3items_remove_logout() throws InterruptedException {
		
		HomePage hompg= new HomePage(driver);
		hompg.hoverover(driver);
		hompg.signin_button(driver);
		
		LoginPage_2 lgpg= new LoginPage_2(driver);
		lgpg.us_input();
		lgpg.cnt_button();
		lgpg.pass_input();
		lgpg.subt_button();
		
		SearchResultPage_3 srchp= new SearchResultPage_3(driver);
		srchp.search_product();
		srchp.product_select();
		srchp.multiple_window(driver);
		
		CartPage cpg= new CartPage(driver);
		cpg.addcart();
		cpg.select_options();
		cpg.deleteitem();
		
		hompg.hoverover(driver);
		hompg.signout_button(driver);
		
	}

}
