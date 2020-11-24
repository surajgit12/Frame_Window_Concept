package comparator;

import java.util.Comparator;

public class EidComp implements Comparator<Object>{

	public int compare(Object o1, Object o2) {
		
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o1;
		
		if(e1.eid==e2.eid)
			return 0;
		
		else if(e1.eid> e2.eid)
			return 1;
		else
			return -1;
					
	}

}
