package AlertConcept;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ImplicitWait {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// driver.get("https://facebook.com/");

		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']"))
		
		
		
		
		
		
// u_0_b
//	WebElement element = driver.findElement(By.id("email"));

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(10, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement elementlink = driver.findElement(By.xpath("//h3[text() ='NC ABC - NC.gov']"));
				if (elementlink.isEnabled()) {

					System.out.println("Element found");

				}
				return elementlink;
			}
		});

		element.click();

	}
}
