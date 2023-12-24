package Tugas_Array1; 

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Latihan09 {
	public static void main(String[] args) {
        String inputUkuran = JOptionPane.showInputDialog("Masukkan jumlah array:");
        int ukuranArray = Integer.parseInt(inputUkuran);
        ArrayList<Integer> nilaiArray = new ArrayList<>();

        for (int i = 0; i < ukuranArray; i++) {
            String inputNilai = JOptionPane.showInputDialog("Masukkan Angka ke-" + i + ":");
            int nilai = Integer.parseInt(inputNilai);
            nilaiArray.add(nilai);
        }

        int bilanganTerbesar = nilaiArray.get(0);
        int bilanganTerkecil = nilaiArray.get(0);

        for (int i = 1; i < nilaiArray.size(); i++) {
            int nilai = nilaiArray.get(i);
            if (nilai > bilanganTerbesar) {
                bilanganTerbesar = nilai;
            }
            if (nilai < bilanganTerkecil) {
                bilanganTerkecil = nilai;
            }
        }

        StringBuilder hasilArray = new StringBuilder("Output Array: \n");
        for (int i = 0; i < nilaiArray.size(); i++) {
            hasilArray.append("x[").append(i).append("] = ").append(nilaiArray.get(i)).append("\n");
        }

        JOptionPane.showMessageDialog(null, hasilArray.toString() + "Nilai terbesar adalah: " + bilanganTerbesar + "\nNilai terkecil adalah: " + bilanganTerkecil);
    }
}
