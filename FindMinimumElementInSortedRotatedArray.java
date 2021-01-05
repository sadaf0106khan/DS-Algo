package arrays;

public class FindMinimumElementInSortedRotatedArray {
	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 6, 1, 1, 2, 2, 2 };
		if (a.length == 1) {
			System.out.println(a[0]);
		} else if (a[a.length - 1] < a[a.length - 2]) {
			System.out.println(a[a.length - 1]);
		} else {
			for (int i = 1; i < a.length; i++) {
				if (a[i] < a[i - 1] && a[i] <= a[i + 1]) {
					System.out.println(a[i]);

				}
			}
		}
	}
}
