package ArrayConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ListAA {

	public static void main(String[] args) {


		String [] a = {"aaa","bb","ccc"};
		
		ArrayList a1 = new ArrayList(Arrays.asList(a));
		a1.add(500);
		a1.add("suraj");
		a1.add("punam");
		a1.add(5);
		boolean b= a1.contains(a);
		System.out.println(b);
		
        System.out.println(a1);
	}

}
