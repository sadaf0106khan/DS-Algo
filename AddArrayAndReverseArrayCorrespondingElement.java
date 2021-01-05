package arrays;

public class AddArrayAndReverseArrayCorrespondingElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 8 };
		int[] b = new int[a.length];
		int i = 0, j = a.length - 1, k = 0;
		while (i < a.length && j >= 0) {
			b[k] = a[i] + a[j];
			k++;
			i++;
			j--;
		}
		for (int no : b) {
			System.out.print(no + " ");
		}
	}

}
