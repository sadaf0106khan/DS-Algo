package arrays;

//kadan's algorithm
public class MaximumSumSubArray {
	public static void main(String[] args) {
		int a[] = { -2, 2, 5, 6, -11, 6 };
		System.out.println(maximumSum(a));
	}

	private static int maximumSum(int[] a) {
		int max = Integer.MIN_VALUE;
		int currentsum = 0;
		for (int i = 0; i < a.length; i++) {
			currentsum += a[i];
			if (currentsum > max) {
				max = currentsum;
			}
			if (currentsum < 0) {
				currentsum = 0;
			}
		}
		return max;
	}
}
