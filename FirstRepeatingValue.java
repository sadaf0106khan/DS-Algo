package arrays;

public class FirstRepeatingValue {
	public static void main(String[] args) {
		int [] a= {3,5,90,15,-3,-3,8,15,-5,-5};
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
					count++;
					if(count==1) {
						break;
					}
				}
			}
			if(count==1)
			{
				System.out.println(a[i]+" is the first repeating value in given array");
				break;
			}

		}
	}

}
