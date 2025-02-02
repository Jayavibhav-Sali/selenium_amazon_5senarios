package Amazon_Package.amazon_project;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Launchandquit {
	
	WebDriver driver;
	
	@BeforeTest
	public void launch() {
		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Please enter browser name below");
		
		String name= sc.next();
		
		if(name.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		
		if(name.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		
		if(name.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
			
	}
	
	
	@AfterMethod
	public void quit() {
		
	//	driver.quit();
		
	}
	
	

}
