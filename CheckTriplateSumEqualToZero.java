package arrays;

public class CheckTriplateSumEqualToZero {
	public static void main(String[] args) {
		int a[] = { -2, 2, 5, 6, 0, 6 };
		System.out.println(isTriplateExist(a));
	}

	private static boolean isTriplateExist(int[] a) {
		int i = 0;
		while (i < a.length - 2) {
			if (pairSum(a, -a[i], i + 1)) {
				return true;
			}
			i++;
		}
		return false;
	}

	private static boolean pairSum(int[] a, int pairsum, int i) {

		int j = a.length - 1;

		while (i < j) {
			if (a[i] + a[j] == pairsum) {
				return true;
			} else if (a[i] + a[j] <= pairsum) {
				i++;
			} else if (a[i] + a[j] >= pairsum) {
				j--;
			}
		}
		return false;
	}
}
