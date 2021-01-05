package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberAppearMoreThenNDividedByK {
public static void main(String[] args) {
	int []a= {1,2,3,3,3,3,4,43,3,33,2,5,5,55,6,66,5,5};
	int k=5;
	int n=a.length;
	int more_than=n/k;
	System.out.println(n);
	Arrays.sort(a);
}
}
