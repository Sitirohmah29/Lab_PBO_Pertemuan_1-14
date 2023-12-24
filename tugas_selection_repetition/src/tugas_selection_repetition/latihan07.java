package tugas_selection_repetition;

import java.util.Scanner;

public class latihan07 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int pesan, pilih;
		 
		 System.out.print("Pilihan:\n 1. Nasi Goreng\n 2. Bubur Ayam\n 3. Soto Ayam\n");
		 System.out.print("Masukkan Pilihan :");
		 
		 pilih = input.nextInt();
		 System.out.println("================");
		 RESTO resto = new RESTO();
		 resto.chooseMenu(pilih);
		 System.out.println("Harga : Rp " + resto.getPrices());
		 System.out.print("Apakah anda akan memesan kembali ? (y/n) :");
		 
		 char pilihan = input.next().charAt(0);
		 if (pilihan == 'y') {
		 main(args);
		 } else {
		 System.out.println("Terima kasih telah memesan.");
		 }
		 }
		}
		class RESTO {
		 private Long harga;
		 public RESTO() {
		 this.harga = 0L;
		 }
		 public void chooseMenu(int pilih) {
		 switch (pilih) {
		 case 1:
		 this.harga = 22000L;
		 break;
		 case 2:
		 this.harga = 15000L;
		 break;
		 case 3:
		 this.harga = 25000L;
		 break;
		 default:
		 System.out.println("Maaf menu yang anda masukkan salah.");
		 }
		 }
		 public Long getPrices() {
		 return this.harga;
		 }
		}

