package AlertConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWeb {
	

		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
		
			// code is working and this is an css celector : .ui.celled.sortable.striped.table.custom-grid.table-scroll>tbody tr td:nth-child(1)

			System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		    driver = new FirefoxDriver();
			driver.get("https://ui.cogmento.com/contacts");
			

			driver.findElement(By.xpath("//input[@type ='text' and @name ='email']")).sendKeys("sumbarkar1221@gmail.com");
			driver.findElement(By.xpath("//input[@type ='password' and @name ='password']")).sendKeys("Supu@123");

		    driver.findElement(By.xpath("//div[@class ='ui fluid large blue submit button']")).click();
		    
		    System.out.println("contact page");
		 Thread.sleep(6000);
  //driver.findElement(By.xpath("//td[contains(text(),'Suraj KKKK')]//parent::td//preceding-sibling::td//input[@name ='id' and @type='checkbox']")).click();
		    
  
  //correct code
  WebElement element = driver.findElement(By.xpath("//td[contains(text(),'Suraj KKKK')]//parent::td//preceding-sibling::td//input[@name ='id' and @type='checkbox']"));
  JavascriptExecutor executor = (JavascriptExecutor)driver;
  executor.executeScript("arguments[0].click()", element);
		}
}
