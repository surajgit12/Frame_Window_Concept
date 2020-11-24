package ArrayConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {

	public static void main(String[] args) {

		int[] a = {111,222,333};
		
		ArrayList al1 =new ArrayList(Arrays.asList(a));
		
		al1.add(10);
		al1.add(55);
		
		
	/*	System.out.println(a1.size());
		System.out.println(a.length);*/
		
		System.out.println(al1);
		
	}

}
