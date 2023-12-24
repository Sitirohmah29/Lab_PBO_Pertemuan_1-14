package Tugas_Array1;

import javax.swing.JOptionPane;

public class Latihan08 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		int n;
		String field[][] = new String[10][3];
		
		n = Integer.parseInt(jop.showInputDialog("Masukan jumlah data: "));
		for (int i = 0; i < n; i++) {
			field[i][0] = jop.showInputDialog("Masukan Nama Lengkap: ");
			field[i][1] = jop.showInputDialog("Masukan Alamat: ");
			field[i][2] = jop.showInputDialog("Masukan No Telp: ");
		}
		for (int i = 0; i < n; i++) {
			System.out.println("\nNama Lengkap: " + field[i][0] + "\nAlamat: " + field[i][1] + "\nNo Telp: " + field[i][2]);
		}
		StringBuilder message = new StringBuilder();
        message.append("Data yang diisi:\n");
        for (int i = 0; i < 3; i++) {
            message.append("\nNama Lengkap:").append(field[i][0]) .append("\nAlamat:").append(field[i][1]).append("\nNo Telp:").append(field[i][2]);
        }

        JOptionPane.showMessageDialog(null, message.toString());
	}
}
