package JavaScriptConcepts;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		/*
		 1) Function is executed for Drag and drop 
		  2) Mouse Over
           3) find the links and print the links*/
		
		System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.get("https://jqueryui.com/droppable/");
		
	/*	driver.switchTo().frame(0);
		Actions action  = new Actions(driver);
		Thread.sleep(5000);
		*/
         List<WebElement> linkslist = driver.findElements(By.tagName("a"));

         System.out.println(linkslist.size());
         
      for(int i =0; i< linkslist.size();i++) {
        	 
        	 System.out.println(linkslist.get(i).getText());
         }
      
     
	 
       

     
//     Iterator<WebElement> itr = linkslist.iterator();
//         while(itr.hasNext()) {
//        	 
//        	 WebElement  str =itr.next();
//        	 System.out.println(str.getText());
//         }
		
	
	  /*  action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
	  
	    .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();*/
		
	    
		/*action.moveToElement(driver.findElement(By.linkText("Interactions"))).build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.linkText("Drag and Drop"))).build().perform();
		driver.findElement(By.linkText("Static")).click();
		
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
	    action.clickAndHold(driver.findElement(By.xpath("//div[@id='dragarea']//div[1]")))
	  
	    .moveToElement(driver.findElement(By.xpath("//div[@id='droparea']"))).release().build().perform();
	System.out.println("drag and drop finish");
	
		
		Thread.sleep(8000);*/
         Thread.sleep(8000);
         driver.quit();
	}

}
