package arrays;

public class MedianOfTwoSortedArray {
public static void main(String[] args) {
	int []a = {1,2};
	int b[]= {3,4};
	double res=findMedianSortedArrays(a,b);
	System.out.println(res);
	
}
	
	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int [] a=new int[nums1.length+nums2.length];
	        int i=0;
	        int j=0;
	        int k=0;
	        double median;
	        while(i<nums1.length&&j<nums2.length){
	            if(nums1[i]<=nums2[j]){
	              a[k]=nums1[i];
	                i++;k++;
	            }
	            else {
	                a[k]=nums2[j];
	            k++;j++;
	            }
	        }
	        if(i>=nums1.length){
	            while(j<nums2.length){
	                a[k]=nums2[j];
	                k++;j++;
	            }
	        }
	        if(j>=nums2.length){
	            while(i<nums1.length){
	                a[k]=nums1[i];
	                k++;i++;
	            }
	        }
	        int index=a.length/2;
	        
	        if(a.length%2==0){
	               median= (double)(a[index]+a[index-1])/2;
	            }
	        else
	            median=a[index];
	        
	        return median;
	    }
	    
	
}
