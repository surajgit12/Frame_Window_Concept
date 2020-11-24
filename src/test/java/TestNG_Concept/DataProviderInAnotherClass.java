package TestNG_Concept;

import org.testng.annotations.DataProvider;

public class DataProviderInAnotherClass {
	
	

	@DataProvider(name= "getData")
	public Object[][] getDataMethod(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "test1";
		data[0][1] = "test2";
		
		data[1][0] = "test3";
		data[1][1] = "test4";
		
		return data;
		
	}

}
