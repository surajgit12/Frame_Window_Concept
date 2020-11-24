package AlertConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isDisplayedisEnabledisSelected {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	/*	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type ='radio' and @name ='radiooptions' and @value ='Male']")).click();
	Thread.sleep(5000);
	boolean isselected= driver.findElement(By.xpath("//input[@type ='radio' and @name ='radiooptions' and @value ='Male']")).isSelected();
    
	System.out.println(isselected);
	*/
		
		/*driver.findElement(By.xpath("//input[contains(@id,'checkbox1')]")).click();
		boolean isSelected = driver.findElement(By.xpath("//input[contains(@id,'checkbox1')]")).isSelected();
		System.out.println(isSelected);*/
		
	
	driver.quit();
	
	
}
}