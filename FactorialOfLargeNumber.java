package arrays;

public class FactorialOfLargeNumber {
	public static void main(String[] args) {
		int[] a = { 3 };
		System.out.println(largeNumber(a));

		System.out.println(factorial(largeNumber(a)));
	}

	public static long factorial(int no) {
		if (no == 1 || 0 == no)
			return 1;
		return no * factorial(no - 1);
	}

	public static int largeNumber(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		return max;
	}
}
