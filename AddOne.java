package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * whole array element represent as a number so add 1 to that number
*/

public class AddOne {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(9);
		list.add(3);
		list.add(9);
		addOne(list);
		for(int no:list) {
			System.out.print(no);
		}
	}
 public static void addOne(List<Integer> list) {
	 for(int i=list.size()-1;i>=0;i--) {
		 if(list.get(i)<9) {
			 list.set(i, list.get(i)+1);
			 return;
		 }
		 else
			 list.set(i, 0);
	 }
	 list.add(0);
	 list.set(0,1);
 }
}
