package FailedScreenShot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChildTest extends ParentTest {
	
	@Test
	public void Test() {
		
	/*	 driver  = new FirefoxDriver();
		
		 driver = new ChromeDriver();*/
		
	//	ChromeDriver driver = new ChromeDriver();
		
		//ChromeDriver driver1 = new ChromeDriver();
		 
		System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		 driver = new  FirefoxDriver();
		 
		 driver.get("https://www.google.com/");
		
	       System.setProperty("webdriver.chrome.driver", "E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\chromedriver.exe");
		   driver = new  ChromeDriver();
		
		
		
	
		 driver.get("https://www.google.com/");
	}
	
	

}
