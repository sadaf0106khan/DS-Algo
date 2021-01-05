package arrays;

public class FirstNonRepeatingValueInArray {
	public static void main(String[] args) {
		int [] a= {5,-8,5,8,9,9,15,25,25,25,79};
			for(int i=0;i<a.length;i++) {
			int j;
			for(j=0;j<a.length;j++) {
				if(i!=j&&a[i]==a[j]) {
					break;
			}
				
			}
			if(j==a.length) {
				System.out.println(a[i]);
				break;
			}
				
		}
	}
}
