package TestNG_Concept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	
	@DataProvider(name= "getData")
	public Object[][] getDataMethod(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "test1";
		data[0][1] = "test2";
		
		data[1][0] = "test3";
		data[1][1] = "test4";
		
		return data;
		
	}
	
	@Test(dataProvider ="getData", dataProviderClass = DataProviderInAnotherClass.class )
	public void Tc_01(String username , String password) {
		
		System.out.println(username);
		System.out.println(password);		
		
	}
	
}
