package uml;

import java.util.ArrayList;
import java.util.Scanner;
public class main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Masukkan nama pelanggan: ");
	        String namaPelanggan = scanner.nextLine();

	        Pelanggan pelanggan = new Pelanggan(namaPelanggan);

	        while (true) {
	            System.out.println("\nMenu Layanan:");
	            System.out.println("1. Tambah Layanan");
	            System.out.println("2. Lihat Riwayat Layanan");
	            System.out.println("3. Keluar");
	            System.out.print("Pilih menu: ");
	            int pilihan = scanner.nextInt();

	            switch (pilihan) {
	                case 1:
	                    scanner.nextLine(); // Membuang karakter newline
	                    System.out.print("Jenis Layanan: ");
	                    String jenisLayanan = scanner.nextLine();
	                    System.out.print("Tanggal Layanan: ");
	                    String tanggalLayanan = scanner.nextLine();
	                    System.out.print("Estimasi Biaya: ");
	                    double estimasiBiaya = scanner.nextDouble();

	                    pelanggan.tambahLayanan(jenisLayanan, tanggalLayanan, estimasiBiaya);
	                    System.out.println("Layanan berhasil ditambahkan.");
	                    break;
	                case 2:
	                    ArrayList<layanan> riwayatLayanan = pelanggan.getRiwayatLayanan();
	                    System.out.println("\nRiwayat Layanan:");
	                    for (int i = 0; i < riwayatLayanan.size(); i++) {
	                        layanan layanan = riwayatLayanan.get(i);
	                        System.out.println("Layanan ke-" + (i + 1));
	                        System.out.println("Jenis Layanan: " + layanan.getJenisLayanan());
	                        System.out.println("Tanggal Layanan: " + layanan.getTanggal());
	                        System.out.println("Estimasi Biaya: " + layanan.getEstimasiBiaya());
	                        System.out.println("Status Selesai: " + (layanan.isSelesai() ? "Selesai" : "Belum Selesai"));
	                    }
	                    break;
	                case 3:
	                    System.out.println("Terima kasih! Program berakhir.");
	                    System.exit(0);
	                default:
	                    System.out.println("Pilihan tidak valid.");
	            }
	        }
	    }
	}




