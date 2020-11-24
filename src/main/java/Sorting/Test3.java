package Sorting;

import java.util.ArrayList;
import java.util.Collections;

import comparator.EidComp;

public class Test3 {

	public static void main(String[] args) {


		ArrayList<Emp> al = new ArrayList<Emp>();
		
	    al.add(new Emp(999, "asuraj"));

	    al.add(new Emp(222, "abc"));

	    al.add(new Emp(333, "durga"));
	    
	   Collections.sort(al, new EidComp());
	    
	    for(Emp ee :al) {
	    	
	    	System.out.println(ee.eid+ " "+ee.ename);
	    }
		

	}

}
