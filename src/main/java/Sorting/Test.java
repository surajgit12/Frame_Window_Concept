package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>(); 
		
		a.add("suraj");
		a.add("ff");
		a.add("zzaadec");
		
		a.add("aadec");
		
		System.out.println("Before sorting" +a);
		
		Collections.sort(a);
		
		System.out.println("After sorting" +a);
		
		
		
	}

}
