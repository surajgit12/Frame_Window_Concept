package FailedScreenShot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class ScreenShotTest extends BaseClass  {
	
	@BeforeMethod
	public void SetUp() {
		
		System.out.println("sss");
		initialization();
		
		
	}
	

	
	@AfterMethod    
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	@Test()
	public void takeScreenShotsTest1() {
		driver.get("https://www.google.com/");
		String titles = driver.getTitle();
		Assert.assertEquals("home tgest", titles);
      //   Assert.assertEquals(true, false);
			
	}
	
	@Test
	public void takeScreenShotsTest2() {

		driver.get("https://www.google.com/");
		Assert.assertEquals(true, true);
			
	}
	
	@Test(enabled =false)
	public void takeScreenShotsTest3() {

		driver.get("https://www.google.com/");
		Assert.assertEquals(true, true);
			
	}

}
