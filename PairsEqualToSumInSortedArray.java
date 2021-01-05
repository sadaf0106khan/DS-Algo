package arrays;

public class PairsEqualToSumInSortedArray {

	public static void main(String[] args) {
	int []a= {-3,0,1,2,3,4,5,6,7};
	pairs(a,6);
	}
	private static void pairs(int[]a,int sum) {
		int i=0,j=a.length-1;
		while(i<j) {
			while(a[i]+a[j]<=sum&&i<j) {
				if(a[i]+a[j]==sum) {
				System.out.println(a[i]+" "+a[j]);
				}
				i++;
			}
			j--;
			while(a[i]+a[j]>=sum&&i<j) {
				if(a[i]+a[j]==sum) {
				System.out.println(a[i]+" "+a[j]);
				j--;
				}
			}
			i++;
		}
		
	}
	
	
	
}
