package arrays;
//if number in a contigeous from i to n 
public class FindNumberWhereAllNumberRepeatdTwiceExceptThatOne {
	public static void main(String[] args) {
		int []a= {1,5,1,5,9,6,6,-88,7,8,8,9,7};
//		int n=a[a.length-1];
//		int current_sum=0;
//		int totalsum=(n*(n+1)/2)*2;
//		for(int i=0;i<a.length;i++) {
//			current_sum+=a[i];
//		}
//		int missing_number=totalsum-current_sum;
//		System.out.println(missing_number);
	
		
		
		/*if number given in random and unsorted manner
		*/
	
		for(int i=0;i<a.length;i++) {
			int j;
			for(j=0;j<a.length;j++) {
				if(i!=j&&a[i]==a[j]) {
					break;
			}
				
			}
			if(j>=a.length) {
				System.out.println(a[i]);
				break;
			}
		
		}
	}
}
