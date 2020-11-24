package ArrayConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {

	public static void main(String[] args) {

		String[] a = {"suraj","puname","kkk"};

		ArrayList al1 = new 	ArrayList (Arrays.asList(a));
		
		al1.add(new String("ssss"));
		
		al1.add("ksjjs");
		al1.add(Integer.valueOf(55));
		
		System.out.println(al1);
		
		
	}

}
