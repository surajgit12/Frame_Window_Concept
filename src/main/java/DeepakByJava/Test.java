package DeepakByJava;

public class Test implements Itr1 {

	public static void main(String[] args) {

		Itr1 t = new Test();

		//t.m2();

		t.m1();
		t.m1((int) 1.5f);

	}

	public int m1() {
		int q = 10;
		System.out.println("M1 Method.." + q);
		return 110;

	}

	public float m1(int b) {
		System.out.println("M2 Method : " + b);
		return 1.5f;

	}

}
