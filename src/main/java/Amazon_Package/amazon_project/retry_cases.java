package Amazon_Package.amazon_project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry_cases implements IRetryAnalyzer{

	int intial=0;
	int retry=3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(intial<retry) {
			intial ++;
			return true;
		}
		
		return false;
	}
	
	

}
