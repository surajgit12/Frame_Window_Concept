package JavaScriptConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver.get("https://ui.freecrm.com/");

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://facebook.com/");

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement mobilenumber = driver.findElement(By.name("reg_email__"));
		WebElement signupbtn = driver.findElement(By.id("u_0_13"));
		WebElement forgetlink = driver.findElement(By.linkText("Forgotten account?"));
		

		sendkeys(driver, firstname, 10, "Suraj");
		sendkeys(driver, lastname, 10, "AA");
		sendkeys(driver, mobilenumber, 10, "1222222");
		
		clickOn(driver, forgetlink, 5);
		clickOn(driver, signupbtn, 5);
		alertmessage(driver, "there is an issue with login button");

		Thread.sleep(5000);
		driver.quit();

	}

	public static void alertmessage(WebDriver driver ,String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
		
	}
	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value) {

		WebDriverWait t = new WebDriverWait(driver, timeout);
		t.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);

	}
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}

}
