package comparator;

public class Emp implements Comparable{

	int eid;
	String ename;

	public Emp(int eid, String ename) {

		this.eid = eid;
		this.ename = ename;

	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + "]";
	}

	public int compareTo(Object o) {
		
		 Emp e1 = (Emp)o;
		 if(eid == e1.eid) 
		 {
	    	
		return 0;
	     }
		 else if(eid >e1.eid) {
			 return 1;
		 }
		 else {
		return -1;
		}}
		 
		 public int compareTo(Emp e) {
			
			  return ename.compareTo(e.ename);
			 

}
}
		
