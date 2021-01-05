package arrays;

public class ArrangeEvenInLeftOddInRight {
	public static void main(String[] args) {
		int a[]= {2,3,45,6,5,7,8};
		int n=a.length;
		int i=0,j=1;
		while(i<a.length&&j<a.length-1){
			while(a[i]%2==0)
			{
				i++;
			}
			while(a[j]%2!=0) {
				j++;
			}
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(int no:a) {
			System.out.print(no+" ");
		}
	}
}
