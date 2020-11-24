package TestNG_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Parameters ({ "baseurl", "username","password" })
	@Test
	public void Login(String baseurls , String usernames, String passwords) {

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseurls);
		driver.findElement(By.name("username")).sendKeys(usernames);
		driver.findElement(By.name("password")).sendKeys(passwords);
		driver.findElement(By.id("u2")).click();
		driver.quit();

	}

}
