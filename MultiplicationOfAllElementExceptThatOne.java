package arrays;

public class MultiplicationOfAllElementExceptThatOne {
	public static void main(String[] args) {
		
	
	int a[] = { 1, 2, 4, 6 };

	allMultiplication(a);

	}
	private static void allMultiplication(int[] a) {
		int i, mul = 1;
		for (i = 0; i < a.length; i++) {
			mul *= a[i];

		}
		for (i = 0; i < a.length; i++) 
		System.out.println(a[i] + "  " + mul / a[i]);
	}
}
