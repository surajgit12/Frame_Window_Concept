package FailedScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.gecko.driver",
				"E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\main\\java\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

// 
	public void failed(String testMethodName) {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
FileUtils.copyFile(srcfile, new File("E:\\WorkSpaceAutomations\\Sample_TestNG\\src\\test\\java\\Screenshots\\"+testMethodName+ "_" +".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block

		}

	}
}
