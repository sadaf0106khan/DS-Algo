package arrays;

public class InsrtionSort {
	public static void main(String[] args) {
		int [] a= {1,3,5,-3,-5,90,8,9};
		int temp,j;
		for(int i=1;i<a.length;i++) {
			temp=a[i];
			j=i;
			while(j>0&&a[j-1]<temp) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
				
		}
		System.out.print("Sorted array is : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}
}

