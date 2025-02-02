package Amazon_Pages_Source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class LaunchAndQuit_withoutif_condtion {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launch() {
		
		driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
	}
	
	@AfterMethod
	public void quit() {
		
		//driver.quit();
	}

}
