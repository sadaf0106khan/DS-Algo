package arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int []a= {-9,-4,-5,2,4,66,777,6,7,-90};
		mergeSort(a,0,a.length-1);
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}

	public static void mergeSort(int a[],int lb,int ub) {
		if(lb<ub) {
			int mid=(lb+ub)/2;
			mergeSort(a,lb,mid);
			mergeSort(a,mid+1,ub);
			merge(a,lb,mid,ub);
		}
	}
	public static void merge(int [] a,int lb,int mid,int ub){
		int i=lb;
		int j=mid+1;
		int k=lb;
		int [] b=new int[a.length];
		while(i<=mid&&j<=ub) {
			if(a[i]<=a[j]) {
				b[k]=a[i];
				i++;
				k++;
			}
			else {
				b[k]=a[j];
			j++;
			k++;
			}
		}
		if(i>mid) {
			while(j<=ub) {
				b[k]=a[j];
				j++;
				k++;
			}
		}
		if(j>ub){
			while(i<=mid) {
				b[k]=a[i];
				i++;
				k++;
			}
		}
		for(k=lb;k<=ub;k++) {
		
			a[k]=b[k];
			
		}
		
	}
}
