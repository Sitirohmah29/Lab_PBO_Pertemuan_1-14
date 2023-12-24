package Quiz_Kelas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class joptiopane {
 	    public static void main(String[] args) {
	        ArrayList<Book> books = new ArrayList<Book>();

	        while (true) {
	            int menu = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n1. Input Buku \n2. Tampilkan Informasi Buku \n0. Keluar"));

	            switch (menu) {
	                case 0:
	                    JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan program ini.");
	                    System.exit(0);
	                    break;
	                case 1:
	                    String judul = JOptionPane.showInputDialog("Judul: ");
	                    String penulis = JOptionPane.showInputDialog("Penulis: ");
	                    String penerbit = JOptionPane.showInputDialog("Penerbit: ");
	                    int tahunTerbit = Integer.parseInt(JOptionPane.showInputDialog("Tahun Terbit: "));

	                    Book newBook = new Book(judul, penulis, penerbit, tahunTerbit);
	                    books.add(newBook);
	                    JOptionPane.showMessageDialog(null, "Buku berhasil ditambahkan.");
	                    break;
	                case 2:
	                    if (books.isEmpty()) {
	                        JOptionPane.showMessageDialog(null, "Tidak ada data buku. Harap tambahkan buku terlebih dahulu.");
	                    } else {
	                        for (int i = 0; i < books.size(); i++) {
	                        	
	                            JOptionPane.showMessageDialog(null,"\nInformasi Buku:"+"\nBuku ke-" + (i + 1)+"\nJudul: " + books.get(i).getjudul()+"\nPenulis: " + books.get(i).getpenulis()+"\nPenerbit: " + books.get(i).getpenerbit()+"\nTahun Terbit: " + books.get(i).gettahun_terbit());
	                        }
	                    }
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Pilihan menu tidak valid. Silakan coba lagi.");
	                    break;
	            }
	        }
	    }
	}


