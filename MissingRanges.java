package arrays;

public class MissingRanges {
	public static void main(String[] args) {
		int []a= {0,1,3,50,90,100};
		int i,j;
		for(i=0;i<a.length-1;i++){
			for(j=0;j<=i+1;j++){
			if(a[j]-a[i]==2 &&j!=i) {
				System.out.println("the missing range is "+(a[i]+1));
			}
				
			else if(a[j]-a[i]>1 &&j!=i) {
				System.out.println("the missing range is "+(a[i]+1)+" to "+(a[j]-1));
			}
			
		}
	}
	
	}

}
