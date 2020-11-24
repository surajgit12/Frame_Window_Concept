package AlertConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RANDOME {

	public static void main(String[] args) throws AWTException {


		
System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		
		WebDriver driver = new  FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		

		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		
		 
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
