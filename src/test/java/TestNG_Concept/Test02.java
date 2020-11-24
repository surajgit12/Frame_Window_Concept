package TestNG_Concept;

import org.testng.annotations.Test;

public class Test02 extends ParallelExecutions {
	
	@Test
	public void Tc_03() throws InterruptedException {

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.quit();
		System.out.println("clas 2 test 3 method");
		

	}
	
	@Test
	public void Tc_04() throws InterruptedException {

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("clas 2 test  4 method");
		

	}

}
