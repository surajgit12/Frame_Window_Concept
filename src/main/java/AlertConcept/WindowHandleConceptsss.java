package AlertConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleConceptsss {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");

		System.out.println("title of main window---->" + driver.getTitle());

		// WebElement tabwindowbtn =
		driver.findElement(By.xpath("//div[@id='Tabbed']//a")).click();
		
		Thread.sleep(5000);
		
		SwitchToWinodw(1);
		
		System.out.println("title of child window--->"+driver.getTitle());
		driver.close();
		
/*
		Set<String> windowIds = driver.getWindowHandles();
 
		Iterator<String> itr = windowIds.iterator();
		
		String mainwindow = itr.next();
		
		String childwindow = itr.next();
		
		driver.switchTo().window(childwindow);
		
		System.out.println("title of child window--->"+driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.switchTo().window(mainwindow);*/

		SwitchToWinodw(0);
		
		System.out.println("title of main window--->"+driver.getTitle());
		
		driver.quit();
	}

	
	public static void SwitchToWinodw(int index) {

		String windowId = null;
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr = windowIds.iterator();
		
		for(int i= 0 ;i<=index ;i++) {
			windowId = itr.next();
		}
		
		driver.switchTo().window(windowId);
	}
}
