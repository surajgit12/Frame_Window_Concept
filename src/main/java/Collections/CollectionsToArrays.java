package Collections;

import java.util.ArrayList;

public class CollectionsToArrays {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("aa");
		a1.add("bb");
		a1.add("cc");
		
		
	String[] str = new String[a1.size()];
	
	str[0] ="s1s";
	
       a1.toArray(str);
       	
       	for(String ss :str){
       	System.out.println(ss);	
       	}
	}

}
