//package iseng;
//import java.io.File;
//
//import javax.swing.*;
//import javax.swing.filechooser.FileNameExtensionFilter;
//
//public class Jfile {
//
//    public static void main(String[] args) {
//        // Buat objek JFileChooser
//        JFileChooser fileChooser = new JFileChooser();
//
//        // Set filter untuk file yang dapat dipilih
//        fileChooser.setFileFilter(new FileNameExtensionFilter("File teks", "txt"));
//
//        // Tampilkan jendela dialog
//        int pilihan = fileChooser.showOpenDialog(null);
//
//        // Jika pengguna memilih file
//        if (pilihan == JFileChooser.APPROVE_OPTION) {
//            // Dapatkan path file yang dipilih
//            File file = fileChooser.getSelectedFile();
//
//            // Tampilkan path file di console
//            System.out.println("Path file: " + file.getAbsolutePath());
//        }
//    }
//}
