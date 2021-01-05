package arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int [] a= {2,1,3,-5,90,89,0,-11,-5,-5,-3};
		boolean result=searchElement(a,90);
		if(result==true)
			System.out.println("Given value is exist");
		else
			System.out.println("not found");
	}
	
	public static boolean searchElement(int []a,int value) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
					return true;
				}
		}
	return false;	
	}
}
