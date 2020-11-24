package TestNG_Concept;

import org.testng.annotations.Test;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestUtility.TestUtil;

public class ReadDataExcel {
	
	String sheetName ="DataExcel";
	
	@DataProvider
	public Object[][] getData1() throws EncryptedDocumentException, InvalidFormatException{
		

		Object[][]  data = TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	@Test(dataProvider ="getData1")
	public void loginData(String Firstname , String Lastname, String gmail) {
		
		System.out.println(Firstname);
		System.out.println(Lastname);
		System.out.println(gmail);
		
		
	}
	
	

}
