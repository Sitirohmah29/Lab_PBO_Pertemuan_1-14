//package Quiz_Kelas;
//
//import java.util.Scanner;
//
//public class Nyoba {
//	public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        String[][] Book = new String[10][4];
//        int pilihan = -1;
//        
//       while(pilihan !=0) {
//    	   System.out.println("\nMenu:");
//    	   System.out.println("1. Input");
//    	   System.out.println("2. Output");
//    	   System.out.println("0. Keluar");
//    	   System.out.print("Pilih menu:");
//    	   pilihan = input.nextInt();
//    	   
//    	   switch (pilihan) {
//    	   case 1:
//    		   inputBook(input,Book);
//    		   break;
//    	   case 2:
//    		   outputBook(Book);
//    		   break;
//    	   case 0:
//    		   
//    	   }
//       }
//            input.nextLine(); // Membersihkan newline
//            int i;
//			System.out.println("Buku ke-" + (i + 1));
//            System.out.print("Judul: ");
//            String judul = input.nextLine();
//            System.out.print("Penulis: ");
//            String penulis = input.nextLine();
//            System.out.print("Penerbit: ");
//            String penerbit = input.nextLine();
//            System.out.print("Tahun Terbit: ");
//            Integer tahun_terbit = input.nextInt();
//
//            // Membuat objek buku dan menyimpannya dalam array
//            books[i] = new Book(judul, penulis, penerbit, tahun_terbit);
//        
//
//        // Menampilkan informasi buku
//        System.out.println("\nInformasi Buku:");
//        for (int i = 0; i < jumlahBuku; i++) {
//            System.out.println("Buku ke-" + (i + 1));
//            System.out.println("Judul: " + books[i].getjudul());
//            System.out.println("Penulis: " + books[i].getpenulis());
//            System.out.println("Penerbit: " + books[i].getpenerbit());
//            System.out.println("Tahun Terbit: " + books[i].gettahun_terbit());
//            System.out.println();
//        }
//
//        input.close();
//    }
//}
