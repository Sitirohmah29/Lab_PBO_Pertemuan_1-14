package soal2;

import  javax.swing.JOptionPane;

public class appmain {
	static Biodata mybio = new Biodata();
	
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String fullname = jop.showInputDialog(null, "Masukkan nama Anda: ");
		System.out.println(fullname);
		String name = mybio.ShowName(fullname);
		
		String usia = jop.showInputDialog(null, "Masukkan usia anda sekarang: ");
		System.out.println(usia);
		int Age = Integer.parseInt(usia);
		int umur = mybio.ShowUsia(Age);
		
		String alamat = jop.showInputDialog(null, "Masukkana Alamat Anda");
		System.out.println(alamat);
		String addres = mybio.ShowAlamat(alamat);
		
		String input1 = JOptionPane.showInputDialog(null, "Masukkan nama anda:, Masukkan usia anda:, Masukan alamat anda:");
		String[] inputs = input1.split(",");
		String input2 = inputs[0].trim();
		String input3 = inputs[1].trim();
		String input4 = inputs[2].trim();
		
		jop.showMessageDialog(null, "Nama Anda:"+input2+"\nUmur Anda:"+input3+"\nAlamat Anda:"+input4);
	}

}
