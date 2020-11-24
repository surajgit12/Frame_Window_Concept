package LaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testing_1 {

	WebDriver driver;

	@Test
	public void launchBrowserTest() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver",
		  "E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\chromedriver.exe"
		  ); driver = new ChromeDriver();
		 

		/*System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();*/

		driver.get("http://www.yopmail.com/");

		// Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("15apr20ms");
		driver.findElement(By.xpath("//input[@class='sbut']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("ifmail");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='magic-link']")).click();
		
		for (String handle : driver.getWindowHandles()) {
			 
		    driver.switchTo().window(handle);}
		
		driver.findElement(By.xpath("//a[@id='hs-eu-confirmation-button']")).click();
		
	}}
