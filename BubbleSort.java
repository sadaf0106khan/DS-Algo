package arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] a= {1,3,5,-3,-5,90,8,9};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted array is : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}

}
