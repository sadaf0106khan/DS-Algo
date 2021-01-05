package arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int []a= {1,3,5,8,12};
		int []b= {1,2,4,5,13};
		int []c= new int[a.length+b.length];
		mergeTwoArray(a,b,c);
	}
	
	private static void mergeTwoArray(int []a, int []b,int[] c) {
		
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				i++;k++;
			}else if(b[j]<a[i]) {
				c[k]=b[j];
				j++;k++;}
		}
		if(i>=a.length) {
			while(j<b.length) {
				c[k]=b[j];
				k++;j++;
			}
		}
		if(j>=b.length) {
			while(i<a.length) {
				c[k]=a[i];i++;k++;
			}
		}
		for(int no:c) {
			System.out.print(no+" ");
		}
	}

}




#####################################################

class mergespaceO(1) {
	public static void main (String[] args) {
	   
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int []a=new int[n];
	     int k;
	    for(k=0;k<n;k++){
	        a[k]=sc.nextInt();
	    }
	     int l;int []b=new int[m];
	    for(l=0;l<m;l++){
	        b[l]=sc.nextInt();
	    }
	    
	    
	   
	   
	    
	    
		    
		    for(int i=b.length-1;i>=0;i--){
		        int last=a[a.length-1];
		        int j;
		        for(j=a.length-2;j>=0&&a[j]>b[i];j--){
		        
		            a[j+1]=a[j];
		            
		        }
		        if(j!=a.length-2||last>b[i]){
		            a[j+1]=b[i];
		            b[i]=last;
		        }
		        
		    }
		for(int no:a){
		    System.out.print(no+" ");
		}
		for(int no:b){
		    System.out.print(no+" ");
		}
	}
}
