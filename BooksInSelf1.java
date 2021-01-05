package arrays;

import java.util.Scanner;

public class BooksInSelf1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int res=totalBooks(n);
		System.out.println(res);
	}

	public static int totalBooks(int n) {
		int len = 0;
		for (int i = 1; i <= n; i++) {
			int temp=i;
			while (temp != 0) {

				temp = temp / 10;
				len++;
			}
		}
		return len;
	}
}
