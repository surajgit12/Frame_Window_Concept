package Collections;

public class Emp {

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

}
