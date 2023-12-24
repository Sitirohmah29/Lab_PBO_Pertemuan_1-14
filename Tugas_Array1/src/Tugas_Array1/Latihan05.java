package Tugas_Array1;

import javax.swing.JOptionPane;

public class Latihan05 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
    	field[0] = jop.showInputDialog(null, "Masukan Nama Lengkap anda: ");
    	System.out.println(field[0]);
    	field[1] = jop.showInputDialog("Masukan Alamat anda: ");
    	System.out.println(field[1]);
    	field[2] = jop.showInputDialog("Masukan No Telp anda: ");
    	System.out.println(field[2]);

    	JOptionPane.showMessageDialog(null, "Nama Lengkap: " + field[0] + "\nAlamat: " + field[1] + "\nNo Telp: " + field[2]);
	}
}
