package quiz;

public class Latihan2 {
	public static void main(String[] args) {
		int step =0;
		for(int a = 8; a>= 1; a--) {
			step -= a-2 ;
			System.out.print(a + (a > 1 ? "-" : "="));
		}
		System.out.println(step);
	}
}
