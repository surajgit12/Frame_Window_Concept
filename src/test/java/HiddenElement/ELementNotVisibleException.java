package HiddenElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.Arguments;

public class ELementNotVisibleException {

	
	static WebDriver driver;
	
	
	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		//driver.findElement(By.xpath("//div[@class='post hentry uncustomized-post-template']//div[1]//input[1]")).click(); //ElementNotInteractableException
		
		
	
		
	//	WebElement element = driver.findElement(By.id("java"));
		
		
	List<WebElement> element1 = driver.findElements(By.id("male"));
	
	       int count = element1.size();
	       
	       System.out.println("Weblement count is " +count);
	       
	      
	       for(int i=0;i<=count;i++) {
	    	   
	    	 int x =  element1.get(i).getLocation().getX();
	    	   
	    	   if(x!=0) {
	    		   element1.get(i).click();
	    		   break;
	    	   }
	    	   
	       }
		
/*		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element1);
*/
	}

}
