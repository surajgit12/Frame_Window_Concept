package ParallelTestExecutionForClassTestsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class classTest2 {
	
	
	 WebDriver driver;
	@Test
	public void Test2() {
		
		System.out.println("I am inside Test2 |" +Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
	}

}
