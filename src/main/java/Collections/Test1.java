package Collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("suraj");

		al.add("punam");

		al.add(10);
		
	

		al.add(new Integer(100));
		al.add(10);
		al.add(10.5);
		al.add(null);
		
		al.add(new Emp(555, "Suuua"));
        al.add(new student(888, "corona"));
		for (Object o : al) {

			if( o instanceof Emp) {
				 Emp e = (Emp)o;
				 System.out.println(e.eid+ " "+e.ename);
			}
			
			if(o instanceof student) {
				
				student s = (student)o;
				System.out.println(s.sid+ " "+s.sname);
				
			}

		}

	}

}
