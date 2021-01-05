package arrays;

public class SecondMinimumValue {
public static void main(String[] args) {
	int [] a= {-3467,5,64,3,-434,67,90};
	int smallest=Integer.MAX_VALUE;
	int second_smallest=Integer.MAX_VALUE;
	
	for(int i=0;i<a.length;i++){
			if(a[i]<smallest) {
				smallest=a[i];
			}
	}
			for(int i=0;i<a.length;i++){
			if(a[i]<second_smallest&&a[i]>smallest) {
				second_smallest=a[i];
			}
		}
	System.out.println(smallest);
	System.out.println(second_smallest);
	
}
}
