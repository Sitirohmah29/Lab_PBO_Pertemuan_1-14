package tugas_selection_repetition; 

import java.util.Scanner; 

public class latihan02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan digit terakhir NPM : ");
		int npm = input.nextInt();
		
		if(isPrime(npm)) {
			System.out.println("Termasuk bilangan PRIMA");
		}else {
			System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
		}
	}
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		if(n == 2) {
			return true;
		}
		if(n % 2 == 0) {
			return false;
		}
		for(int i = 3; i <= Math.sqrt(n); i += 2) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}