package amazon_tests_testcases;

import org.testng.annotations.Test;

import Amazon_Package.amazon_project.HomePage;
import Amazon_Package.amazon_project.WishListPage;
import Amazon_Pages_Source.LaunchAndQuit_withoutif_condtion;
import Amazon_Pages_Source.LoginPage_2;
import Amazon_Pages_Source.SearchResultPage_3;

public class testcase_4_addandrremove_logout extends LaunchAndQuit_withoutif_condtion  {
	
	
	@Test
	public void add_remove_logout() throws InterruptedException {
		
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
		
		
		WishListPage wlpg= new WishListPage(driver);
		wlpg.viewlist();
		wlpg.removeitem();
		
		
		hompg.hoverover(driver);
		hompg.signout_button(driver);
		
		
	}
	
}
