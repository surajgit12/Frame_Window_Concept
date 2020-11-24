package FailedScreenShot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BaseClass implements ITestListener {

	public void onTestFailure(ITestResult result) {

		System.out.println("FailedTestCaes");
		failed(result.getMethod().getMethodName());

	}

	public void onTestStart(ITestResult result) {

		System.out.println("Test Method Started.." + result.getName());
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test Method Success.." + result.getName());
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test Method Skipped.." + result.getName());

	}

	public void onStart(ITestContext context) {

		System.out.println("Test Method started.." + context.getName());

	}

	public void onFinish(ITestContext context) {

		System.out.println("Test Method finish.." + context.getName());
	}

}
