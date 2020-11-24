package Collections;

public class student {
	
	int sid;
	String sname;

	public student(int sid, String sname) {
		
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + "]";
	}

}
