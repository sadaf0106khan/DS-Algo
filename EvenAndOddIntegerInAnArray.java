package arrays;

import java.util.Scanner;

public class EvenAndOddIntegerInAnArray {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Array Limit");
//		int n=sc.nextInt();
//		int a[]=new int[n];
		int a[]= {2,3,45,6,5,7,8};
		int n=a.length;
		int counteven=0,countodd=0;
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				
				System.out.println(a[i]+" is even");
				counteven++;
			}else {
				System.out.println(a[i]+" is odd");
				countodd++;
			}
		}
		System.out.println("total no. of odd = "+countodd);
		System.out.println();
		System.out.println("total no. of even = "+counteven);
	}

}
