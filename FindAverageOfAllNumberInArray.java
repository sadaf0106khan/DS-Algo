package arrays;

public class FindAverageOfAllNumberInArray {
public static void main(String[] args) {
	double a[]= {19,12.89,16.5,200,13.7};
	System.out.printf("%.3f",averageOfAllElement(a));
	//System.out.println(averageOfAllElement(a));
}
	
	
	public static double averageOfAllElement(double [] a) {
		
		double sum=0;
		for(double no:a) {
			sum+=no;
		}
		double average=sum/a.length;
		
		return average;
	}
}
