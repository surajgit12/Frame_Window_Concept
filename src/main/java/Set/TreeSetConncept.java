package Set;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetConncept {

	public static void main(String[] args) {


		TreeSet<String> t = new TreeSet<String>(new mycomp());
		
	    t.add("ravi");//Adding object in arraylist  
        t.add("vijay");  
        t.add("ravi");  
        t.add("ajay"); 
        t.add("bbaa");
        
       
        
        System.out.println(t);
        
        
	}

}
