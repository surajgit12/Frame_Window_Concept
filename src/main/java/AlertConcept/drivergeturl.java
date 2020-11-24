package AlertConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class drivergeturl {

	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	/*    driver.navigate().to("http://demo.automationtesting.in/Register.html");
	    driver.navigate().to(" http://demo.automationtesting.in/WebTable.html");
		driver.navigate().back();
		driver.navigate().forward();
		*/
		
		
	    driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
	}

}
