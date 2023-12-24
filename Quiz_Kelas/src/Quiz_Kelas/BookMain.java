package Quiz_Kelas;
import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();

        // Membuat array untuk menyimpan objek-objek buku
        Book[] books = new Book[jumlahBuku];

        // Mengisi array buku
        for (int i = 0; i < jumlahBuku; i++) {
            input.nextLine(); // Membersihkan newline
            System.out.println("Buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Penerbit: ");
            String penerbit = input.nextLine();
            System.out.print("Tahun Terbit: ");
            Integer tahun_terbit = input.nextInt();

            // Membuat objek buku dan menyimpannya dalam array
            books[i] = new Book(judul, penulis, penerbit, tahun_terbit);
        }

        // Menampilkan informasi buku
        System.out.println("\nInformasi Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Buku ke-" + (i + 1));
            System.out.println("Judul: " + books[i].getjudul());
            System.out.println("Penulis: " + books[i].getpenulis());
            System.out.println("Penerbit: " + books[i].getpenerbit());
            System.out.println("Tahun Terbit: " + books[i].gettahun_terbit());
            System.out.println();
        }

        input.close();
    }
}
