package Set;

import java.util.TreeSet;

public class TrrrsetMethods {

	public static void main(String[] args) {
		
		
		
		TreeSet<String> set=new TreeSet<String>();  
        set.add("E");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        set.add("A");
       
        System.out.println("sorted format"+set);
        
        System.out.println("reverse"+set.descendingSet());
        
        System.out.println("head"+set.headSet("D"));
        System.out.println("tail"+set.tailSet("D"));
        System.out.println("subset"+set.subSet("A", "E"));
  
}  }