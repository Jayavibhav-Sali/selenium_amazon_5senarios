package Amazon_Pages_Source;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launch() {
		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Please enter browser name below");
		
		String name= sc.next();
		
		if(name.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			driver.navigate().to("https://www.amazon.in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		if(name.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			driver.navigate().to("https://www.amazon.in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		if(name.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			driver.navigate().to("https://www.amazon.in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
			
	}

	@AfterMethod
	public void quit() {
		
	//	driver.quit();
		
	}
	
	

}
