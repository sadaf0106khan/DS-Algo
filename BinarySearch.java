package arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int []a= {-9,0,2,67,89,90,93,93,98};
		binarySearch(a,99);
	}
	
	public static void binarySearch(int []a,int value) {
		int start=0;
		int end=a.length-1;
		
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==value) {
				System.out.println("Given number "+value+" is find at location "+mid);
				break;
			}
			else if(a[mid]<value) {
				start=mid+1;
			}
			else
				end=mid-1;
		}
		if(start>end) {
			System.out.println("given number not present");
		}
	}

}
