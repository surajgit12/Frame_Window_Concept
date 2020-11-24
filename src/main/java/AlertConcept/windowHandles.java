package AlertConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandles {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Thread.sleep(3000);

		String mainwindow = driver.getWindowHandle();

		driver.getTitle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> itr = s1.iterator();
		while (itr.hasNext()) {

			String childwindow = itr.next();

			if (!mainwindow.equalsIgnoreCase(childwindow)) {

				driver.switchTo().window(childwindow);
				driver.findElement(By.name("emailid")).sendKeys("sss@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				Thread.sleep(3000);
				System.out.println("child title--->" + driver.getTitle());
				driver.close();

			}
		}
		
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(mainwindow);
		System.out.println("Parent title--->" + driver.getTitle());
	}
}
