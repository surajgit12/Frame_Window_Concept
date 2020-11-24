package JavaScriptConcepts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KrishnaWaits {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.moveToElement(driver.findElement(By.id("sss"))).build().perform();
		 */

		// //*[@id="1588775351920-grid-container"]/div[2]/div/div[1]

		// correct code fecthing values from 
		List<WebElement> element = driver.findElements(By.cssSelector(".ui-grid-canvas>div>div>div:nth-child(1)>div"));
		Iterator<WebElement> itr = element.iterator();
		
		while(itr.hasNext()) {
			
			WebElement sname= itr.next();
			System.out.println(sname.getText());
			
		}

	}

}
