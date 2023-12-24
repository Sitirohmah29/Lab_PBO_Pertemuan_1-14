package tugas_selection_repetition;

import java.util.Scanner; 

public class latihan10 {
	 		private static int saldo = 1000000;
		    public static void main(String[] args) {
		    	    
		    	        // Inisialisasi scanner
		    	        Scanner scanner = new Scanner(System.in);

		    	        // Masukkan PIN
		    	        System.out.print("Masukkan PIN: ");
		    	        String pin = scanner.nextLine();

		    	        // Periksa PIN
		    	        if (checkPIN(pin)) {
		    	            boolean lanjutTransaksi = true;

		    	            while (lanjutTransaksi) {
		    	                // Tampilkan menu
		    	                System.out.println("Menu ATM:");
		    	                System.out.println("1. Lihat saldo");
		    	                System.out.println("2. Setor tunai");
		    	                System.out.println("3. Tarik tunai");
		    	                System.out.println("4. Keluar");

		    	                // Pilih menu
		    	                System.out.print("Pilih menu: ");
		    	                int menu = scanner.nextInt();

		    	                switch (menu) {
		    	                    case 1:
		    	                        // Lihat saldo
		    	                        lihatSaldo();
		    	                        break;
		    	                    case 2:
		    	                        // Setor tunai
		    	                        setorTunai();
		    	                        break;
		    	                    case 3:
		    	                        // Tarik tunai
		    	                        tarikTunai();
		    	                        break;
		    	                    case 4:
		    	                        // Keluar
		    	                        System.out.println("Terima kasih telah menggunakan ATM kami.");
		    	                        lanjutTransaksi = false;
		    	                        break;
		    	                    default:
		    	                        System.out.println("Menu tidak valid.");
		    	                        break;
		    	                }

		    	                if (lanjutTransaksi) {
		    	                    // Konfirmasi keluar
		    	                    System.out.print("Apakah Anda ingin melanjutkan transaksi? (y/n): ");
		    	                    String lanjut = scanner.next();

		    	                    if (lanjut.equals("n")) {
		    	                        // Selesai
		    	                        System.out.println("Terima kasih telah menggunakan ATM kami.");
		    	                        lanjutTransaksi = false;
		    	                    }
		    	                }
		    	            }
		    	        } else {
		    	            // PIN salah
		    	            System.out.println("PIN salah. Silakan coba lagi.");
		    	            main(args);
		    	        }
		    	    }

		    	    private static boolean checkPIN(String pin) {
		    	        return pin.equals("290803");
		    	    }

		    	    private static void lihatSaldo() {
		    	        System.out.println("Saldo Anda: Rp" + saldo);
		    	    }

		    	    private static void setorTunai() {
		    	        Scanner scanner = new Scanner(System.in);
		    	        System.out.print("Masukkan nominal setor tunai: ");
		    	        int setorTunai = scanner.nextInt();
		    	        saldo += setorTunai; // Menambah saldo
		    	        System.out.println("Saldo Anda sekarang: Rp" + saldo);
		    	    }

		    	    private static void tarikTunai() {
		    	        Scanner scanner = new Scanner(System.in);
		    	        System.out.print("Masukkan nominal tarik tunai: ");
		    	        int tarikTunai = scanner.nextInt();
		    	        if (saldo >= tarikTunai) {
		    	            saldo -= tarikTunai; // Mengurangi saldo jika mencukupi
		    	            System.out.println("Saldo Anda sekarang: Rp" + saldo);
		    	        } else {
		    	            // Saldo tidak mencukupi
		    	            System.out.println("Saldo tidak mencukupi.");
		    	        }
		    	    }
		    	
}
