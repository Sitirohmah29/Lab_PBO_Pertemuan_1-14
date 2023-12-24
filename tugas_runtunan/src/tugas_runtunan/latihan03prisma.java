package tugas_runtunan;

import java.util.Scanner; 

public class latihan03prisma {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			float panjangAlas, tinggiSegitiga, tinggiPrisma;
			double luasAlas, Volume;
			
			System.out.println("Program menghitung Luas dan Volume Prisma Segitiga");
			System.out.println("------------------===============-----------------");
			
			System.out.print("Masukan panjang alas segitiga: ");
			panjangAlas = input.nextFloat();
			System.out.print("Masukan tinggi segitiga: ");
			tinggiSegitiga = input.nextFloat();
			System.out.print("Masukan tinggi prisma: ");
			tinggiPrisma = input.nextFloat();
			
			luasAlas = 0.5 * panjangAlas * tinggiSegitiga;
			Volume = luasAlas * tinggiPrisma;
			
			System.out.println("Luas alas segitiga: "+luasAlas);
			System.out.println("Volume prisma segitiga: "+Volume);
			
			input.close();
		}
}