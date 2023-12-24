package Quiz1;

import javax.swing.JOptionPane;

public class Biodata {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String[] biodata = new String[3];
    	biodata[0] = jop.showInputDialog(null, "Masukan Nama Lengkap anda: ");
    	System.out.println(biodata[0]);
    	biodata[1] = jop.showInputDialog("Masukan Usia anda: ");
    	System.out.println(biodata[1]);
    	biodata[2] = jop.showInputDialog("Masukan Alamat anda: ");
    	System.out.println(biodata[2]);

    	JOptionPane.showMessageDialog(null, "Full Name: " + biodata[0] + "\nAge: " + biodata[1] + "\nAddress: " + biodata[2]);
	}
}
