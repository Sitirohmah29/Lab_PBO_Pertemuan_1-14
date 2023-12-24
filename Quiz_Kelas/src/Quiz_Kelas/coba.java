package Quiz_Kelas;

import java.util.Scanner;
import java.util.ArrayList;

public class coba {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        ArrayList<Book> books = new ArrayList<Book>();

	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Input Buku");
	            System.out.println("2. Tampilkan Informasi Buku");
	            System.out.println("0. Keluar");
	            System.out.print("Pilih menu (0/1/2): ");
	            int menu = input.nextInt();
	            
	            switch (menu) {
	                case 0:
	                    System.out.println("Terima kasih telah menggunakan program ini.");
	                    System.exit(0);
	                    break;
	                case 1:
	                    input.nextLine(); // Membersihkan newline
	                    System.out.print("Judul: ");
	                    String judul = input.nextLine();
	                    System.out.print("Penulis: ");
	                    String penulis = input.nextLine();
	                    System.out.print("Penerbit: ");
	                    String penerbit = input.nextLine();
	                    System.out.print("Tahun Terbit: ");
	                    int tahunTerbit = input.nextInt();
	                    
	                    // Membuat objek buku dan menyimpannya dalam ArrayList
	                    Book newBook = new Book(judul, penulis, penerbit, tahunTerbit);
	                    books.add(newBook);
	                    System.out.println("Buku berhasil ditambahkan.\n");
	                    break;
	                case 2:
	                    if (books.isEmpty()) {
	                        System.out.println("Tidak ada data buku. Harap tambahkan buku terlebih dahulu.\n");
	                    } else {
	                        // Menampilkan informasi buku
	                        System.out.println("\nInformasi Buku:");
	                        for (int i = 0; i < books.size(); i++) {
	                            System.out.println("Buku ke-" + (i + 1));
	                            System.out.println("Judul: " + books.get(i).getjudul());
	                            System.out.println("Penulis: " + books.get(i).getpenulis());
	                            System.out.println("Penerbit: " + books.get(i).getpenerbit());
	                            System.out.println("Tahun Terbit: " + books.get(i).gettahun_terbit());
	                            System.out.println();
	                        }
	                    }
	                    break;
	                default:
	                    System.out.println("Pilihan menu tidak valid. Silakan coba lagi.\n");
	                    break;
	            }
	        }
	    }
	}

