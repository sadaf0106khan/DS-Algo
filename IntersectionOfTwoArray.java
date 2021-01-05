package arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		int [] a= {2,3,45,6,5,5,5,5};
		int [] b= {1,3,5,5,5,590,8,9};
		Set<Integer> intersection=new HashSet<>();
		Set<Integer> intersection1=new HashSet<>();
		for(int no:a) {
			intersection.add(no);
		}
		for(int no:b) {
			if(intersection.contains(no)) {
				intersection1.add(no);
			}
			
		}
		
		for(int no:intersection1) {
			System.out.print(no+" ");
		}
	}
}
