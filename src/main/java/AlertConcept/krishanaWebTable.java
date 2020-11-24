package AlertConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class krishanaWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");

		Thread.sleep(5000);

		/*WebElement element = driver.findElement(By.xpath(
				"//*[@id=\"1588775351920-grid-container\"]/div[2]/div/div[2]//child::div[6]//child::div//i[@class ='fa fa-pencil']"));
		Thread.sleep(5000);
		Actions action = new Actions(driver);

		action.moveToElement(element).doubleClick().build().perform();*/
		
		
		  WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'')]/div[2]/div/div[2]//child::div[6]//child::div//i[@class ='fa fa-pencil']"));
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click()", element1);
		  
		  Actions action1 = new Actions(driver);

			action1.moveToElement(element1).doubleClick().build().perform();
			

	    

	}

}
