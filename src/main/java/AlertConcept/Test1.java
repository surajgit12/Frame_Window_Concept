package AlertConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
	//	Alert alert = driver.switchTo().alert(); /// throws NoAlertPresentException
		
		
		Thread.sleep(3000);
	    // driver.findElement(By.name("//input[@name='submit']")).click(); // InvalidSelectorException

		
              driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(3000);
		
	
		
		Alert alert = driver.switchTo().alert();
		
	
	
	      String str =  alert.getText();
		System.out.println(alert.getText());
	//	Do you really want to delete this Customer?
		Thread.sleep(3000);
		if(str.equals("Do you really want to delete this Customer?")) {
			
			System.out.println("correct alert message is displayed");
		}
		else {
			System.out.println("Incorrect alert message is displayed");
		//alert.accept();
		alert.dismiss();
		
		Thread.sleep(5000);

		driver.quit();
	}
	}
}
