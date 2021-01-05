package arrays;

public class PythagorianTriplate {
public static void main(String[] args) {
	int a[]= {2,3,6,7,4,12,13,5};
	pythagorianTriplate(a);
}
	
	public static void pythagorianTriplate(int [] a) {
		int i,j,k;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				for(k=0;k<a.length;k++) {
					if(a[i]*a[i]==a[j]*a[j]+a[k]*a[k]||a[j]*a[j]==a[i]*a[i]+a[k]*a[k]||a[k]*a[k]==a[j]*a[j]+a[i]*a[i]) {
						System.out.print(a[i]+" "+a[j]+" "+a[k]);
						System.out.println();
					}
					
				}
			}
			
		}
	}
}
