package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylisttocollections {

	public static void main(String[] args) {


		String[] str = {"aaa","bbb", "ccc"};
		
		ArrayList a1 = new ArrayList(Arrays.asList(str));
		
		a1.add("suraj");
		a1.add(999);
		
		System.out.println(a1);
		
		/*for(Object o: a1) {
			
			System.out.println(o);
		}*/

	}

}
