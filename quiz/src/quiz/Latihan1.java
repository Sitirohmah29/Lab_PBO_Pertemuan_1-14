package quiz;

public class Latihan1 {
	public static void main(String[] args) {
		int total = 0; 
		int pnjng = 5;
		for(int a = 1; a <= pnjng; a++) {
			total += a;
			System.out.print(a + (a < pnjng ? "+" : "="));
		}
		System.out.println(total);
	}
}
