package Set;

import java.util.HashSet;
import java.util.Iterator;

public class AddlALl {

	public static void main(String[] args) {


		HashSet<String> h1 =new HashSet<String>();
		
		h1.add("suraj");
		h1.add("amar");
		h1.add("punam");
		h1.add("kav");
		
		
//		h1.forEach(a->{ //Here, we are using lambda expression  
//            System.out.println(a); 
//		});
		/*for(String ss : h1) {
			System.out.println(h1);
		}*/
/*		
HashSet<String> h2 =new HashSet<String>();
		
		h2.add("joke");
		h2.add("ambo");
		h2.add("punam");
		
		h2.addAll(h1);*/
		
		
		 Iterator<String> itr =h1.iterator();
		 
		 while (itr.hasNext()) {
			     
			   System.out.println(itr.next());
			    
			    
		 }
		
	}
}
