package arrays;

public class MaximumAndMinimumElement {

	public static void main(String[] args) {
		int [] a= {-10,3,5,-3,-5,90,8,9};
		int min=a[0];
		int max=a[0];
		int i=0;
		while(i<a.length) {
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>max) {
				max=a[i];
			}
			i++;
		}

		System.out.println("minimum value is "+min);
		System.out.println("maximum value is "+max);
	}
}
