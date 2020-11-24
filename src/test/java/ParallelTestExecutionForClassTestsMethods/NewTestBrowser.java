package ParallelTestExecutionForClassTestsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestBrowser {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void verifyPageTitle(@Optional("d")String browser) throws InterruptedException {

	
		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		Thread.sleep(1000);
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\test\\java\\broswers\\chromedriver.exe");
		driver = new ChromeDriver();


		System.out.println(driver.getTitle());
		// System.out.println(title);
		// Assert.assertEquals(title, true);
	}
}
