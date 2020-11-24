package ParallelTestExecutionForClassTestsMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest1 extends ParallelTestExecution {
	
	
	@Test
	public void Test1() {
		
		
		driver.get("https://www.google.com/");
		
		
	}

}
