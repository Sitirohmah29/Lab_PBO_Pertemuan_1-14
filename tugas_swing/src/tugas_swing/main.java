package tugas_swing;

import javax.swing.JOptionPane;

public class main {
	static biodata mybiodata = new biodata();
	
	public static void main(String[] args) {
	JOptionPane jop = new JOptionPane ();
	
	String fullname = jop.showInputDialog(null, "Masukan nama anda: ");
	System.out.println(fullname);
	String nama = mybiodata.showfullname(fullname);
	
	String usia = jop.showInputDialog(null, "Masukan usia Anda: ");
	System.out.println(usia);
	int Umur= Integer.parseInt(usia);
	
	String alamat = jop.showInputDialog(null,"Masukan alamast anda:");
	System.out.println(alamat);
	String Alamat = mybiodata.showalamat(alamat);
	
	jop.showMessageDialog(null, "Nama : "+nama +"\nUsia : "+usia+"\nAlamat : "+Alamat );
	}
}
