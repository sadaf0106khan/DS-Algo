package arrays;

public class QuickSort {
	
	public static int partition(int []a,int lb,int ub) {
		
		int pivot=a[lb];
		int start=lb;
		int end=a.length-1;
		
			while(start<end) 
			{
				while(a[start]<=pivot)
				{
					start++;
				}
					while(a[end]>=pivot) 
					{
						end--;
					}
						if(start<end) 
						{
							int temp=a[start];
							a[start]=a[end];
							a[end]=temp;
						}
			}
					int temp=a[lb];
					a[lb]=a[end];
					a[end]=temp;
					
			return end;
		}
		
	public static void quickSort(int []a,int lb,int ub) {
		if(lb<ub) {
			int loc=partition(a,lb,ub);
			quickSort(a,lb,loc-1);
			quickSort(a,loc+1,ub);
		}
	}
		
	public static void main(String[] args) {
		int [] a= {2,1,3,5,90,89,0,-11,-5,-5,-3};
	
		quickSort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}	
}


