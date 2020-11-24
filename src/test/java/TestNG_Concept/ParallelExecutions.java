package TestNG_Concept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutions {

	WebDriver driver;
    
	@Parameters({"browser"})
    @BeforeClass
	public void launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

	}

	@Test
	public void Tc_01() throws InterruptedException {

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.quit();
		System.out.println(" class 1 Test 1 method");
		

	}
	
	@Test
	public void Tc_02() throws InterruptedException {

		driver.get("https://www.google.com/");
		alertmessage(driver, "Google page is not popup correctly");
		
		Thread.sleep(2000);
		//driver.quit();
		System.out.println("class 2  Test 2 method");
		

	}
	
	public static void alertmessage(WebDriver driver ,String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
		
	}

}
