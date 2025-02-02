package amazon_tests_testcases;

import org.testng.annotations.Test;

import Amazon_Package.amazon_project.HomePage;
import Amazon_Package.amazon_project.LoginPage;
import Amazon_Package.amazon_project.PaymentPage_new_Practice;
import Amazon_Package.amazon_project.SearchResultPage_Pactice_onwaits;
import Amazon_Package.amazon_project.paymentpage_5;
import Amazon_Pages_Source.LaunchAndQuit_withoutif_condtion;

public class practice_waits extends LaunchAndQuit_withoutif_condtion {
	
	@Test
	public void practice_on_waits() {
		
		HomePage hmg= new HomePage(driver);
		hmg.hoverover(driver);
		hmg.signin_button(driver);
		
		LoginPage lgp= new LoginPage(driver);
		lgp.us_input();
		lgp.cnt_button();
		lgp.pass_input(driver);
		lgp.subt_button();
		
		
		 SearchResultPage_Pactice_onwaits spg= new SearchResultPage_Pactice_onwaits(driver); 
		 spg.search_product();
		 spg.product_select();
		 spg.multiple_window(driver); 
		 spg.wish_list();
		 spg.continueshopping(driver); 
		 spg.addtocart_button(driver);
		 
		 PaymentPage_new_Practice pypg= new PaymentPage_new_Practice(driver);
		 pypg.buyproduct();
		 pypg.usepayment(driver);
		 pypg.revieworder(driver);
		 pypg.placeorder(driver);
			
			
			hmg.hoverover(driver);
			hmg.signout_button(driver);
		 	
		
	}	

}
