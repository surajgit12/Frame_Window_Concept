package AlertConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTable {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		

		System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.get("https://ui.cogmento.com/contacts");
		

		driver.findElement(By.xpath("//input[@type ='text' and @name ='email']")).sendKeys("sumbarkar1221@gmail.com");
		driver.findElement(By.xpath("//input[@type ='password' and @name ='password']")).sendKeys("Supu@123");

	    driver.findElement(By.xpath("//div[@class ='ui fluid large blue submit button']")).click();
	    
	    System.out.println("contact page");
	 //   Thread.sleep(6000);
	//    driver.findElement(By.xpath("//td[contains(text(),'Suraj KKKK')]//parent::td//preceding-sibling::td//div[@class ='ui checked fitted read-only checkbox']//input[@name ='id' and @type='checkbox']")).click();
	    
	//  JavascriptExecutor js = (JavascriptExecutor)driver;
	  WebDriverWait some_element = new WebDriverWait(driver,10); 
	  some_element.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'Suraj KKKK')]//parent::td//preceding-sibling::td//input[@name ='id' and @type='checkbox']"))).click();
	   
	  
	  Thread.sleep(5000);
	   driver.quit();
	    
	    // Method =1
	    
	/*  //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2] */
  
	   /* String beforexpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
	    String Afterxpath = "]/td[2]";
	    
	    Thread.sleep(5000);
	    
	    for(int i=1 ;i<=12;i++) {
	    	 Thread.sleep(5000);
	 	    
	    	driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tfoot/tr/th[2]/div[2]/a[3]")).click();
		    
		    Thread.sleep(5000);
	    	String name = driver.findElement(By.xpath(beforexpath+i+Afterxpath)).getText();
	    	System.out.println(name);
	    	if(name.contains("Test Test_Te2")) {
	    		
	    		driver.findElement(By.xpath(beforexpath+i+Afterxpath)).click();
	    		
	    	}
	    	
	    }
	    */
 /// Method = 2
	    
	}
	 

}
