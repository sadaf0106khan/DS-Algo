package arrays;

public class SquaredMatrix {
	public static void main(String[] args) {
		int []a= {1,2,3,4};
		squaredMatrix(a);
		cubicMatrix(a);
	}
	public static void squaredMatrix(int []a) {
		System.out.println("Squared matrix of given matrix is = ");
		for(int no:a) {
			System.out.print(no*no+" ");
		}
		System.out.println();
	}
	public static void cubicMatrix(int []a) {
		System.out.println("Cubic matrix of given matrix is = ");
		for(int no:a) {
			System.out.print(no*no*no+" ");
		}
	}

}
