package Collections;

import java.util.ArrayList;

public class Test2 {


	
	public static void main(String[] args) {
		
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		
		Emp e1 = new Emp(111,"suraj");
		Emp e2 = new Emp(222,"ccc");
		Emp e3 = new Emp(333,"ddd");
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		
		
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		
		Emp e4 = new Emp(444,"www");
		Emp e5 = new Emp(555,"zzz");
		
		a2.add(e4);
		a2.add(e5);
		
	    a2.addAll(a1);
		
		a2.retainAll(a1);
		System.out.println(a2);
	
		
		
		
	
         
        
	}

}
