package JavaScriptConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsPopupConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
	    driver = new FirefoxDriver();
    	driver.get("http://demo.automationtesting.in/Windows.html");
    	
    	System.out.println("Main window title is---> "+driver.getTitle());
    	/*Actions  action = new Actions(driver);
    	
    	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"))).build().perform();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Windows')]")).click();*/
    	
    	driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
    	
    	
    	SwitchToWindow(2);
    //	System.out.println("after window title is-----> "+driver.getTitle());
    	
/*    	
    	Set<String> windows = driver.getWindowHandles();
    	Iterator<String> itr = windows.iterator();
    	  
    	String mainwindow =  itr.next();

    	String childwindow =  itr.next();
    	
    	driver.switchTo().window(childwindow);*/
     	Thread.sleep(5000);
    	
     	System.out.println("after window title is-----> "+driver.getTitle());
     	
     	driver.close();
     	Thread.sleep(5000);
     	SwitchToWindow(1);
   /*  	driver.switchTo().window(childwindow);
    	*/
     	System.out.println("after window title is-----> "+driver.getTitle());
     	
    	
    	Thread.sleep(5000);
        driver.quit(); 
    
	}

	
	public static void SwitchToWindow(int index) {
		String windowId = null;
		Set<String> windows = driver.getWindowHandles();
    	Iterator<String> itr = windows.iterator();
    	  
    for(int i =1 ;i<=index;i++) {
    	windowId = itr.next();
    }
		driver.switchTo().window(windowId);
	
}
}