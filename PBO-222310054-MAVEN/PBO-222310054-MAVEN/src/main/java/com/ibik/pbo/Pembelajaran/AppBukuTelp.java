package com.ibik.pbo.Pembelajaran;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBukuTelp {
	public static void main(String args[]) {
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		JOptionPane box = new JOptionPane();
		String output = "";
		String repeat = box.showInputDialog(null,"Masukkan jumlah data.");
		int ulang = Integer.parseInt(repeat);	

		for(int i = 0; i<ulang;i++) {
			data.add(new ArrayList<String>());
			box.showMessageDialog(null,"Data ke "+(i+1));
			String nama = box.showInputDialog(null,"Masukkan Nama Lengkap");
			data.get(i).add(0,nama);
			String alamat = box.showInputDialog(null,"Masukkan Alamat");
			data.get(i).add(1,alamat);
			String telp = box.showInputDialog(null,"Masukkan No Telepon");
			data.get(i).add(2,telp);
		}

		for (int i = 0; i<ulang;i++) {
			output = output +   "\n\nData ke - "+(i+1)+
					"\n\nNama   : "+data.get(i).get(0)+
					"\nAlamat : "+data.get(i).get(1)+
					"\nNo Telp: "+data.get(i).get(2);
		}
		box.showMessageDialog(null,"======Output Data======"+output);
	}
}