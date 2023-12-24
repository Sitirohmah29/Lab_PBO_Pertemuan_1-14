package Tugas_Array2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Latihan04 {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        int n;
        ArrayList<ArrayList<String>> field = new ArrayList<ArrayList<String>>();

        n = Integer.parseInt(jop.showInputDialog("Masukkan jumlah data: "));
        for (int i = 0; i < n; i++) {
            field.add(new ArrayList<String>());
            field.get(i).add(jop.showInputDialog("Masukkan Nama Lengkap: "));
            field.get(i).add(jop.showInputDialog("Masukkan Alamat: "));
            field.get(i).add(jop.showInputDialog("Masukkan No Telp: "));
        }

        // Menggunakan komparator untuk mengurutkan data berdasarkan nama
        Collections.sort(field, new Comparator<ArrayList<String>>() {
            public int compare(ArrayList<String> a, ArrayList<String> b) {
                return a.get(0).compareTo(b.get(0));
            }
        });

        System.out.println("Data setelah diurutkan berdasarkan Nama Lengkap:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nNama Lengkap: " + field.get(i).get(0) + "\nAlamat: " + field.get(i).get(1) + "\nNo Telp: " + field.get(i).get(2));
        }

        StringBuilder message = new StringBuilder();
        message.append("Data yang diisi (diurutkan berdasarkan Nama Lengkap):\n");
        for (int i = 0; i < n; i++) {
            message.append("\nNama Lengkap:").append(field.get(i).get(0)).append("\nAlamat:").append(field.get(i).get(1)).append("\nNo Telp:").append(field.get(i).get(2));
        }

        JOptionPane.showMessageDialog(null, message.toString());
    }
}
