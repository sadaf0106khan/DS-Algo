package arrays;

public class RemoveInPlace {
	public static void main(String[] args) {
		int[] a = { 1,4,5,5,8,8};
		int count = 1;
		int i = 0, j = 1;
		while (j < a.length) {
			if (a[i] == a[j]) {
				j++;
			} else {
				count++;

				i = j;

				j = i + 1;
			}
		}
		System.out.println("length " + count);
	}
}
