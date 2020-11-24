package JavaScriptConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowsConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");

		System.out.println("title of main window---->" + driver.getTitle());

		//WebElement tabwindowbtn = 
		driver.findElement(By.xpath("//div[@id='Tabbed']//a")).click();;
		Thread.sleep(5000);
		
		String str = driver.getWindowHandle();
		System.out.println("current window handle--->"+str);
		
		Set<String> handles =driver.getWindowHandles();

		System.out.println("current window handle--->"+str);
		
		for(String d : handles )
		{
		System.out.println("current window handless--->"+d);
		}
		
		
		System.out.println("title of child window---->" + driver.getTitle());
		
		
		
		Thread.sleep(5000);
		//driver.quit();
	}

}
