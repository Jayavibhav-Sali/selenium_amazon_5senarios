package amazon_tests_testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Amazon_Package.amazon_project.HomePage;
import Amazon_Package.amazon_project.paymentpage_5;
import Amazon_Package.amazon_project.productpage_4;
import Amazon_Package.amazon_project.retry_cases;
import Amazon_Pages_Source.LaunchAndQuit_withoutif_condtion;
import Amazon_Pages_Source.LoginPage_2;
import Amazon_Pages_Source.SearchResultPage_3;

//Login to amazon->search a product->
//add it to wishlist->add it to cart->
//Make a paymnet using COD->logout			

public class testcase_2_login_whishlist_addtocart_cod_logout extends LaunchAndQuit_withoutif_condtion{
	
	@Test(retryAnalyzer=retry_cases.class)
	public void tc2_login_addtowihslist_addcart_cod_logout() throws InterruptedException {
		
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
		srchp.wish_list();
		srchp.continueshopping();	
		srchp.addtocart_button(driver);
		
		paymentpage_5 pypg= new paymentpage_5(driver);
		pypg.buyproduct();
		pypg.usepayment();
		pypg.revieworder();
		pypg.placeorder();
		
		
		hompg.hoverover(driver);
		hompg.signout_button(driver);
		
		
	}

}
