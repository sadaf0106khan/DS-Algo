package arrays;
import java.util.*;
public class TwoSumEqualToGivenTargetReturnIndex {
	public static void main(String[] args) {
		int[] a = { 11, -7, -11, -15 };
		int[] b = twoSum(a, 4);
		for (int no : b)
			System.out.print(no + " ");
	
	}

	public static int[] twoSum(int[] a, int target) {
		int[] res = new int[2];
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					res[0] = i;
					res[1] = j;
				
					return res;
					
				}
			}
		}

		return res;
	}

}

















