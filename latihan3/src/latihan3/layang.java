package latihan3;

import java.util.Scanner;

public class layang {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double diagnl1, diagnl2, Luas, Keliling;
		float sisi1, sisi2;
		
		System.out.println("Program menghitung Luas dan Keliling Layang-Layang");
		System.out.println("------------------===============-----------------");
		
		System.out.print("Masukan panjang diagonal 1: ");
		diagnl1 = input.nextDouble();
		System.out.print("Masukan panjang diagonal 2:");
		diagnl2 = input.nextDouble();
		System.out.print("Masukan panjang sisi 1: ");
		sisi1 = input.nextFloat();
		System.out.print("Masukan panjang sisi 2: ");
		sisi2 = input.nextFloat();
		
		Luas = 2 * (diagnl1 + diagnl2)/ 2;
		Keliling = 2 * (sisi1 + sisi2);
		
		System.out.println("Luas layang-layang: "+Luas);
		System.out.println("Keliling layamg -layang: "+Keliling);
		
		input.close();
	}
}
