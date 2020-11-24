package ArrayConcept;

public class MaxAndMinArrays {

	public static void main(String[] args) {

		int[] a = { 2, 4, 8, 1, 10, 9 };

		int max = a[0];

		int  temp =0;
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			
				temp = temp-max;
			}

		}
		 System.out.println(temp);
	}

}
