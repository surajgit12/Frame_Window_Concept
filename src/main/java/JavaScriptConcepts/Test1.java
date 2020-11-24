package JavaScriptConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
		
		@Test
		public void launchBrowserTest() throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
			driver = new  FirefoxDriver();
			driver.get("http://demo.automationtesting.in"); 
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
		/*	JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('email').value = 'suraj@gmail.com'");
			js.executeScript("document.getElementById('enterimg').click()");
			Thread.sleep(5000);
			js.executeScript("document.querySelector(\"input[placeholder='First Name']\").value='df'");*/
			Thread.sleep(5000);
			
			//String str = js.executeScript("return document.getElementById('btn2').innerHTML").toString();
			//System.out.println(str);
			
		/*	String str = js.executeScript("return document.title").toString();
			System.out.println(str);
			
			js.executeScript("history.go(0)");*/
			
		//	js.executeScript("window.scrollBy(0,600)");
			
		//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//	js.executeScript("document.getElementById('Skills').scrollIntoView()");
			
			js.executeScript("document.getElementById('enterimg').click()");
			Thread.sleep(5000);
			js.executeScript("window.history.back()");
			Thread.sleep(5000);
			js.executeScript("window.history.forward()");
		//	driver.quit();
			 
		
			
			 
			 
	}

}
