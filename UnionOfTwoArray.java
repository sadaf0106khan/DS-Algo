package arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		int [] a= {2,3,4,5,5,5,5};
		int [] b= {1,3,5,5,5};
		Set<Integer> intersection=new HashSet<>();
		for(int no:a) {
			intersection.add(no);
		}
		for(int no:b) {
			intersection.add(no);
		}
		System.out.print("{ ");
		for(int no:intersection) {
			System.out.print(no+" ");
		}
		System.out.print("}");
	}

}
