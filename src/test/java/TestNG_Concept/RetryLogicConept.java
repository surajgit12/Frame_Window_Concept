package TestNG_Concept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryLogicConept implements IRetryAnalyzer {

	int counter = 0;
	int retryLimit = 2;

	public boolean retry(ITestResult result) {

		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}

}


// there are two ways we can execute failed test cases

//1) @Test level :- retryAnalyzer = RetryAnalyzer.class