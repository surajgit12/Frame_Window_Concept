package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
	
		HashSet<String>  h1 = new HashSet<String>();
		
		h1.add("suraj");
		h1.add("akshay");
		h1.add("suraj");
		h1.add("punam");
		h1.add(null);
		
		System.out.println(h1);
		
		
/*
		LinkedHashSet<String>  h1 = new LinkedHashSet<String>();
		
		h1.add("suraj");
		h1.add("akshay");
		h1.add("suraj");
		h1.add("punam");
		h1.add(null);
		
		System.out.println(h1);*/
		
		
	}

}
