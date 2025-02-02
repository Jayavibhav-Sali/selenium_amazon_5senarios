package amazon_tests_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Amazon_Pages_Source.HomePage_1;
import Amazon_Pages_Source.LaunchAndQuit_withoutif_condtion;
import Amazon_Pages_Source.LaunchandQuit;
import Amazon_Pages_Source.LoginPage_2;
import Amazon_Pages_Source.SearchResultPage_3;

public class testcase_1_Login_Cart_logout extends LaunchAndQuit_withoutif_condtion {
	
	
	
	@Test
	public void testcase_1() throws InterruptedException {
		
		
		
		HomePage_1 hme_page= new HomePage_1(driver);
		hme_page.hoverover(driver);	
		hme_page.signin_button(driver);
		
		
		
		LoginPage_2 lgn_pge= new LoginPage_2(driver);
		lgn_pge.us_input();
		lgn_pge.cnt_button();		
		lgn_pge.pass_input();
		lgn_pge.subt_button();
		
		SearchResultPage_3 srch_pge= new SearchResultPage_3(driver);
		srch_pge.search_product();
		srch_pge.product_select();
		srch_pge.multiple_window(driver);
		srch_pge.wish_list();
		srch_pge.continueshopping();
		srch_pge.addtocart_button(driver);
		
		hme_page.hoverover(driver);	
		hme_page.signout_button(driver);
			
		
	}

}
