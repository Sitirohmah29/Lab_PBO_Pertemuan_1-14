package tugas_runtunan;

import java.util.Scanner;

public class latihan05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukan sebuah string: ");
		String input = scanner.nextLine();
		String uppercase = input.toUpperCase();//fungsi untuk merubah huruf kecil menjadi huruf besar
		System.out.println("Hasil "+uppercase);
		
		scanner.close();
	}
}
