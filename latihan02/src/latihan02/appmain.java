package latihan02;

import javax.swing.JOptionPane;

public class appmain {
	static biodata mybio = new biodata();
	
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String fullname = jop.showInputDialog(null, "Masukan nama anda: ");
		String name = mybio.ShowName(fullname);
		String usia = jop.showInputDialog(null, "Masukan usia anda: ");
		
		System.out.println(usia);
		int Umur = Integer.parseInt(usia);
		Integer umur = mybio.ShowUsia(Umur);
		
		String alamat = jop.showInputDialog(null, "Masukan alamat rumah anda: ");
		System.out.println(alamat);
		String addres = mybio.ShowAlamat(alamat);
		
		String input1 = JOptionPane.showInputDialog(null, "Masukan namaa anda:, Masukan usia anda sekarang:, Masukan alamat rumah anda:");
		String[] inputs = input1.split(",");
		String input2 = inputs[0].trim();
		String input3 = inputs[1].trim();
		String input4 = inputs[2].trim();
		
		jop.showMessageDialog(null, "Nama Anda:"+input2+ "\nUmur Anda:"+input3+ "\nAlamat Anda:"+input4);
	}
}
