package ArrayConcept;

public class ArrayEqualMethod {

	public static void main(String[] args) {
	
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,2,3};
		
		System.out.println(arr1.equals(arr2));
		
		int[] arr3 = {2,2,3};
		
		System.out.println(arr2.equals(arr2));
		
	}

}
