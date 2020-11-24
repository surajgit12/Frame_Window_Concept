package TestNG_Concept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedRetryCases {
	
	
	@Test
	public void TC_01() {
		
		System.out.println("test case 1");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void TC_02() {
		
		System.out.println("test case 2");
		Assert.assertTrue(false);
		
	}

}
