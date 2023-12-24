package Quiz1;

import java.util.Scanner;

public class MenghitungPersegi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float sisi,sisi1, sisi2, luas, keliling;
		
		System.out.println("Program menghitung persegi luas dan keliling ");
		System.out.print("Masukan nilai sisi 1 =");
		sisi1 = input.nextFloat();
		System.out.print("Masukan nilai sisi 2 =");
		sisi2 = input.nextFloat();
		System.out.print("Masukan sisi =");
		sisi = input.nextFloat();
		luas = sisi1 *sisi2;
		keliling = 4 *sisi;
		
		System.out.println("Luas Persegi ="+luas);
		System.out.println("Keliling Persegi ="+keliling);
		
		input.close();
	}
}
