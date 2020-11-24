package AlertConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowhandlesTest {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		System.out.println("title of main window---->" + driver.getTitle());
		driver.findElement(By.xpath("//div[@id='Tabbed']//a")).click();
		/*
		for(int i=0;i<=2;i++) {
			Webclick.click();
		}*/
		
		Thread.sleep(5000);
		
		   Set<String> windowIDs =  driver.getWindowHandles();
		           
		    Iterator<String> itr = windowIDs.iterator();
		   
		    String parentwindow =   itr.next();
		    String childwindow =   itr.next();
		    
		    String hadle = "äa" ;
		    
		   // driver.quit();
		
		  driver.switchTo().window(childwindow);
		//  driver.close();  // gettting NoSuchWindowException
		  
		  driver.switchTo().window(childwindow);
		    
		   /* for (String handle : driver.getWindowHandles()) {
		    
		    	System.out.println(driver.switchTo().window(handle));
		    }*/
		      
		
		   
	  /*// approch through for each loop
		   for(String SS :windowIDs) {
			   
			   if(!childwindow.equals(parentwindow)) {
				driver.switchTo().window(SS);  
			   }
			 //  System.out.println(driver.switchTo().window(SS));
		   }*/
		
		System.out.println("title of child window--->"+driver.getTitle());
		driver.close();

	}

}
