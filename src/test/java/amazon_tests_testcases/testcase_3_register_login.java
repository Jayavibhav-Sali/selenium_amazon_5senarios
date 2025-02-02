package amazon_tests_testcases;

import org.testng.annotations.Test;

import Amazon_Package.amazon_project.HomePage;
import Amazon_Package.amazon_project.LoginPage;
import Amazon_Package.amazon_project.RegistrationPage;
import Amazon_Package.amazon_project.retry_cases;
import Amazon_Pages_Source.LaunchAndQuit_withoutif_condtion;
import Amazon_Pages_Source.LaunchandQuit;

//Registartion of the amazon application and login using the same credentails			

public class testcase_3_register_login extends LaunchAndQuit_withoutif_condtion{
	
	@Test(retryAnalyzer=retry_cases.class)
	public void reg_new_custandlogin() {
		HomePage hmgp= new HomePage(driver);
		hmgp.hoverover(driver);
		hmgp.starthere(driver);
		
		
		LoginPage lgp= new LoginPage(driver);
		lgp.new_username(driver);
		lgp.new_continue(driver);
		lgp.create_act();
		
		RegistrationPage rstp= new RegistrationPage(driver);
		rstp.new_username();
		rstp.new_passwrd();
		rstp.verify_mobile();
		
		
	}

}
