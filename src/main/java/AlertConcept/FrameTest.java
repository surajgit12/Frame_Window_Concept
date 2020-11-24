package AlertConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(5000);
		
		WebElement frame= driver.findElement(By.cssSelector("#singleframe"));
		String fm ="aa"; // NoSuchFrameException
		
		driver.switchTo().frame(frame); 
		
		driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
	//	driver.switchTo().parentFrame();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		
		


	}

}
