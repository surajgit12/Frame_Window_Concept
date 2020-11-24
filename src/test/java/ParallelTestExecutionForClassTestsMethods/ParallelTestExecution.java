package ParallelTestExecutionForClassTestsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestExecution {

	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	
	public void getBrowser(@Optional("browser1") String broswername) {

	//	if (broswername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\WorkSpaceAutomations\\POM_Selenium_Project\\src\\main\\java\\com\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		//}

	//	else if (broswername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\test\\java\\broswers\\chromedriver.exe");
			driver = new ChromeDriver();

	//	}

	}

/*	@Test
	public void Test1() {

		driver.get("https://www.google.com/");

	}*/

}
