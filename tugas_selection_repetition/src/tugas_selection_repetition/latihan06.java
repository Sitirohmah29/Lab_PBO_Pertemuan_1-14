package tugas_selection_repetition;

import java.util.Scanner;

public class latihan06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====Menu Sarapan=====");
		System.out.println("Pilihan Menu:");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		
		int pilih;
			System.out.println("Pilih menu (1-3): ");
			pilih = input.nextInt();
			switch(pilih) {
			case 1:
				System.out.println("Anda memesan Nasi Goreng dengan harga Rp22.000,- ");
				break;
			case 2:
				System.out.println("Anda memesan Bubur Ayam dengan harga Rp15.000,-");
				break;
			case 3:
				System.out.println("Anda memesan Soto Ayam dengan harga Rp25.000,-");
				break;
				default:
					System.out.println("Maaf menu yang anda masukan salah");
			}
	System.out.print("\nApakah anda akan memesan kembali ? (y/n) :");
    char pilihan;
    pilihan= input.next().charAt(0);

    if (pilihan == 'y') {
        main(args);
    } else {
        System.out.println("Terima kasih telah memesan.");
    }
	}
}

