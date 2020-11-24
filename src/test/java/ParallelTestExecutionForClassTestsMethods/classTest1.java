package ParallelTestExecutionForClassTestsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class classTest1 {
	
	
	 WebDriver driver;
	 
		@Test
		public void Test1() {
			
			System.out.println("I am inside Test1 |" +Thread.currentThread().getId());
			System.setProperty("webdriver.gecko.driver",
					"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.get("https://www.google.com/");
		}
		

}
