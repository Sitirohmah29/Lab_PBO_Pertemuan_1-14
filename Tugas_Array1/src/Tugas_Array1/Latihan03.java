package Tugas_Array1;

import javax.swing.JOptionPane;

public class Latihan03 {
	public static void main(String[] args) {
        String inputUkuran = JOptionPane.showInputDialog("Masukkan jumlah array:");
        int ukuranArray = Integer.parseInt(inputUkuran);
        int[] nilaiArray = new int[ukuranArray];

        for (int i = 0; i < nilaiArray.length; i++) {
            String inputNilai = JOptionPane.showInputDialog("Masukkan Angka ke-" + i + ":");
            nilaiArray[i] = Integer.parseInt(inputNilai);
        }
        
        StringBuilder hasilArray = new StringBuilder("Output Array: \n");
        for (int i = 0; i < nilaiArray.length; i++) {
            hasilArray.append("x[").append(i).append("] = ").append(nilaiArray[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, hasilArray.toString());
    }
}
