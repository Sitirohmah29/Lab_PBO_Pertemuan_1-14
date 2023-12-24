package latihan4;

import java.util.Scanner;

public class coba {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String namaBarang;
		double hargaBarang, totalHarga, diskon, totalBayar;
		Integer jumlahBarang;
		
		System.out.print("Masukan nama barang: ");
		namaBarang = input.nextLine();
		System.out.print("Masukan harga barang: ");
		hargaBarang = input.nextDouble();
		System.out.print("Masukan Jumlah barang: ");
		jumlahBarang = input.nextInt();
		
		totalHarga = hargaBarang * jumlahBarang; 
		
		diskon = 0;
		if(jumlahBarang >= 5) {
			diskon = 0.1 * totalHarga;
		}
		
		totalBayar = totalHarga - diskon;
		
		System.out.println("\n====== Kwintasi Pembelian ======");
		System.out.println("Nama Barang: "+ namaBarang);
		System.out.println("Harga Barang: "+ hargaBarang);
		System.out.println("Jumlah Barang: "+ jumlahBarang);
		System.out.println("Total Harga: Rp "+ totalHarga);
		System.out.println("Diskon: Rp "+ diskon);
		System.out.println("Total Bayar: Rp "+ totalBayar);
		System.out.println("==================================");

	}
}
