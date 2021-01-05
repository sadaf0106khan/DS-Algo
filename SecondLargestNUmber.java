package arrays;

public class SecondLargestNUmber {
	public static void main(String[] args) {
		
	
	int [] a= {34,56,67,5,64,3,434,67,90,900};
	int max=Integer.MIN_VALUE;
	int second_max=Integer.MIN_VALUE;
	
	for(int i=0;i<a.length;i++){
			if(a[i]>max) {
				max=a[i];
			}
	}
	for(int i=0;i<a.length;i++){
			if(a[i]>second_max&&a[i]<max) {
				second_max=a[i];
			}
		}
	System.out.println(max);
	System.out.println(second_max);
	}
}
