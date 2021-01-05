package arrays;

public class ReturnFirstAndLastIndexOfGivenTargetInsortedArray {
	static int b[]=new int[2];

	public static void main(String[] args) {
		int a[]= {2,2,2,3,3,4,4};
		int []c=indexFirstAndLast(a,4);
		for(int i=0;i<c.length;i++)
		System.out.print(c[i]+" ");
	}
 public static int[] indexFirstAndLast(int [] a,int t) {
	
	 int i=0;
	 int j=a.length-1;

	 if(i==j&&a[i]==t) {
		 b[0]=0;
	 		b[1]=0;
	 }
	 while(i<j) {
		 
			 if(a[i]==a[j]&&(a[i]==t||a[j]==t)) {
				b[0]=i;
				b[1]=j;
				break;
			  }
			 if(a[i]!=a[j]&&(a[i]!=t||a[j]!=t)) {
				 i++;
				 j--;
			 }
			 if(a[i]!=a[j]&&(a[i]!=t&&a[j]==t)) {
				 i++;
				 
			 }
			 if(a[i]!=a[j]&&(a[i]==t&&a[j]!=t)) {
				 j--;
				 
			 }
			 j--;
			 i++;
		 }
	
		return b; 
	 }
 }

