package swing_tugas;

import javax.swing.JOptionPane;

public class main {
	static latihan03 mybio = new latihan03();
	
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String fullname = jop.showInputDialog(null, "Masukkan nama Anda: ");
		System.out.println(fullname);
		String name = mybio.ShowName(fullname);
		
		String usia = jop.showInputDialog(null, "Masukkan usia anda sekarang: ");
		System.out.println(usia);
		
		String alamat = jop.showInputDialog(null, "Masukkana Alamat Anda");
		System.out.println(alamat);
		String addres = mybio.ShowAlamat(alamat);
		
		if(fullname.isEmpty() || usia.isEmpty() || alamat.isEmpty() ) {
			JOptionPane.showMessageDialog(null, "Field [fullname/usia/alamat] tidak boleh kosong");
		}else {
			try {
				int Umur = Integer.parseInt(usia);
				if(alamat.length() < 10){
				JOptionPane.showMessageDialog(null, "Masukana alamat minimum 10 karakter");
				} else {
					latihan03 mybio = new latihan03();
					mybio.setlatihan03(fullname, usia, alamat);
					JOptionPane.showMessageDialog(null, "Biodata:\nNama: " +mybio.ShowName(name)+ "\nUsia: " +mybio.ShowUsia(usia)+ "\nAlamat"+mybio.ShowAlamat(alamat));
					
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Isian usia harus angka");
			}
		}
	}
	
}

