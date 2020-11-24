package TestNG_Concept;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHardAssert {
	
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void TC_01() {
		
		System.out.println("1st");
		System.out.println("2nd");
		
		softAssert.assertEquals(true, false);
		
		System.out.println("3rd");
		
		softAssert.assertEquals(true, false);
		System.out.println("4rd");
		 
		
	    softAssert.assertAll();

	}
	


}
