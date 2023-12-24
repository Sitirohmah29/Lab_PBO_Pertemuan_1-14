package array;

public class ArrayMultidimensi {
	public static void main(String[] args) {
		int row = 3, column = 2;
		double [][] x =  new double [row][column];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				x[i][j] =  Math.random();
			}
		}
		System.out.println("=Value by index=");
		System.out.println("x[1][1]="+ x[1][1]);
		System.out.println("=Use Loop=");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.println("x["+i+"]["+j+"]="+x[i][j]);
			}
		}
	}
}
