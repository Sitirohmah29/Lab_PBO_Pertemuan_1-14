package Tugas_Array2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan03{
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        int n;
        ArrayList<ArrayList<String>> field = new ArrayList<ArrayList<String>>();

        n = Integer.parseInt(jop.showInputDialog("Masukan jumlah data: "));
        for (int i = 0; i < n; i++) {
            field.add(new ArrayList<String>());
            field.get(i).add(jop.showInputDialog("Masukan Nama Lengkap: "));
            field.get(i).add(jop.showInputDialog("Masukan Alamat: "));
            field.get(i).add(jop.showInputDialog("Masukan No Telp: "));
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\nNama Lengkap: " + field.get(i).get(0) + "\nAlamat: " + field.get(i).get(1) + "\nNo Telp: " + field.get(i).get(2));
        }

        StringBuilder message = new StringBuilder();
        message.append("Data yang diisi:\n");
        for (int i = 0; i < n; i++) {
            message.append("\nNama Lengkap:").append(field.get(i).get(0)).append("\nAlamat:").append(field.get(i).get(1)).append("\nNo Telp:").append(field.get(i).get(2));
        }

        JOptionPane.showMessageDialog(null, message.toString());
    }
}
