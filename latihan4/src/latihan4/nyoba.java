package latihan4;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class nyoba {
    public static void main(String[] args) {
        // Inisialisasi harga roti
        double hargaRoti = 6300;

        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah roti yang dibeli
        System.out.print("Masukkan jumlah roti yang dibeli: ");
        int jumlahRoti = scanner.nextInt();

        // Menghitung total harga
        double totalHarga = jumlahRoti * hargaRoti;

        // Menghitung diskon jika jumlah roti adalah kelipatan 3
        double diskon = 0;
        if (jumlahRoti % 3 == 0) {
            diskon = totalHarga * 0.05; // 5% diskon
        }

        // Menghitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - diskon;

        // Mendapatkan waktu saat ini
        Date waktuSaatIni = new Date();

        // Menggunakan SimpleDateFormat untuk format tanggal
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // Mencetak kwitansi pembelian
        System.out.println("\n===== KWITANSI PEMBELIAN =====");
        System.out.println("TOKO SERBAGUNA IBIK");
        System.out.println("Tanggal/Waktu: " + dateFormat.format(waktuSaatIni));
        System.out.println("------------------------------");
        System.out.println("Jumlah Roti: " + jumlahRoti);
        System.out.println("Harga per Roti: Rp " + hargaRoti);
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total Harga Setelah Diskon: Rp " + totalHargaSetelahDiskon);
        System.out.println("------------------------------");
        System.out.println("Terima kasih telah berbelanja di TOKO SERBAGUNA IBIK!");
    }
}
