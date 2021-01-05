package arrays;

public class ReverseArrayByGivenNUmber {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	reverseByNumber(a,4);
}
	
	
	private static void reverseByNumber(int [] a,int n) {
		int k=n-1;
		int i=0;
		while(i<k) {
			int temp=a[i];
			a[i]=a[k];
			a[k]=temp;
			i++;
			k--;
		}
		for(int no:a) {
			System.out.print(no+" ");
		}
	}
	
}
