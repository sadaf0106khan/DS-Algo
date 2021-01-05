package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangePositivaAndNegativeAlternatively {
	public static void main(String[] args) {
		int[] a = { 4, -1, 3, 2, 1, -1, 2, -3, 6, 4,-5};
	//	int i = 0, j = 1;
//		while (i < a.length && j < a.length - 1) {
//			while (a[i] < 0) {
//				i++;
//			}
//			while (a[j] > 0) {
//				j++;
//			}
//			int temp = a[i];
//			a[i] = a[j];
//			a[j] = temp;
//		}
		Arrays.sort(a);
		int min = 0;
		for (int k = 0; k < a.length; k++) {
			if (a[k] > 0) {
				min = k;
				break;
			}
		}
		System.out.println("starting index of +ive element "+min);
		
		int l = 0, m = min;
		while (l<m&&a[l]<0&&m<a.length) {
			 {
				int temp = a[l];
				a[l] = a[m];
				a[m] = temp;
				l += 2;
				m += 1;
			}
			
		}
		System.out.println();
		for (int no : a) {
			System.out.print(no + " ");
		}
	}

}
