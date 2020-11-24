package JavaScriptConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaveenTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ui.freecrm.com/");

		driver.findElement(By.xpath("//input[@type ='text' and @name ='email']")).sendKeys("sumbarkar1221@gmail.com");
		driver.findElement(By.xpath("//input[@type ='password' and @name ='password']")).sendKeys("Supu@123");

		WebElement lgnbtn = driver.findElement(By.xpath("	//div[@class ='ui fluid large blue submit button']"));

//		NaveenTest t = new NaveenTest();
		// t.flash(lgnbtn, driver);

		flash(lgnbtn, driver);
		drawborder(lgnbtn, driver);
		alertmessage(driver, "there is an issue with login button");
		
		Thread.sleep(5000);
		Alert  al = driver.switchTo().alert();
		 String str =  al.getText();
		 
		 if(str.equals("there is an issue with login button")){
		
			 System.out.println("correct mesage");
		 }
			 
		 else {
			 System.out.println("not a correct msg");
		 }
		 
		 
			// al.accept();
		 al.dismiss();
		 
		 clicElementsbyJS(lgnbtn, driver);
		 
		 // refresh the page
		/* Thread.sleep(5000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
         refreshbrowserjs(driver);*/
         Thread.sleep(5000);
         System.out.println(pagetitebyjs(driver));
         System.out.println(innerPageText(driver));
         ScrollPage(driver);
		
	}

	public static void flash(WebElement element, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String backgrdcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 1000; i++) {

			changeColor("rgb(0,200,0)", element, driver);
			changeColor(backgrdcolor, element, driver);

		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

	}
	
	public static void drawborder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}
	
	public static void alertmessage(WebDriver driver ,String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
		
	}
	// click events 
	public static void clicElementsbyJS(WebElement element , WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
	}
	
	public static void refreshbrowserjs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go[0]");
	}
	
	public static String pagetitebyjs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title =js.executeScript("return document.title;").toString();
		//System.out.println(str);
		return title;
	}
	
	public static String innerPageText(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String pagetext =js.executeScript("return document.documentElement.innerText;").toString();
		//System.out.println(str);
		return pagetext;
	}
	
	public static void ScrollPage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	}
}
