package arrays;

public class RemoveGivenElementFromArray {
	public static void main(String[] args) {
		int[] a = { 4, -1, 3, 2, 1, -1, 2, -3, 6, 4, -5 };
		int len = deleteElement(a, -1);
		System.out.println(len);

	}

	protected static int deleteElement(int[] a, int value) {

		int count = 0;
		int i = 0;
		while (i < a.length) {
			if (a[i] == value) {
				count += 1;
			}
			i++;
		}
		int length = a.length - count;

		return length;
	}
}
