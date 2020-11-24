package JavaScriptConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
	     driver.switchTo().frame("a077aa5e");
	     
	     driver.switchTo().frame("");
		
	//	driver.findElement(By.xpath("//html//body//a//img")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//html//body//a//img")).click();
		System.out.println("****AAAA*********");
		
		Thread.sleep(10000);
		driver.quit();
		
	}

}
