package JavaScriptConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		
		WebDriver driver = new  FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		
		driver.findElement(By.xpath("//input[@type ='submit' and @name ='proceed']")).click();
		
		Alert  al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		String text = al.getText();
		
		if(text.equals("Please enter a valid user1 name")) {
			System.out.println("correct msg");
		}
		
		else {
			System.out.println("not1");
		}
		
	//	al.accept();
		al.dismiss();
		
	}

	
}
