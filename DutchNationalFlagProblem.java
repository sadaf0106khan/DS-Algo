package arrays;

public class DutchNationalFlagProblem {
	public static void main(String[] args) {
		int[] a = { 2, 2, 0, 0, 1, 0, 1, 2, 0, 1, 0, 0, 1, 1, 1, 2, 2, 0, 1, 0 };
		arrange(a);

	}

	public static void arrange(int[] a) {
		int i = 0;
		int j = a.length - 1;
		int k = 0;
		while (k <= j) {
			if (a[k] == 1) {
				k++;
			} else if (a[k] == 0) {
				swap(a, i, k);
				k++;
				i++;
			} else if (a[k] == 2) {
				swap(a, j, k);
				j--;
			}

		}
		for (int no : a) {
			System.out.print(no + " ");
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
