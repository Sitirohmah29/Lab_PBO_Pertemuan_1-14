package soal2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class soal4 {
	String Fullname;
	int Usia;
	String Alamat;
	
	public void setData(String name, int age, String address) {
		Fullname = name;
		Usia = age;
		Alamat = address;
		    }

public static void main(String[] args) {
	soal4 bio = new soal4();
	boolean exit = false;
	while (!exit) {
		String name = JOptionPane.showInputDialog("Masukkan nama lengkap:");
		if (name == null) {
			int choice = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?");
			if (choice == JOptionPane.YES_OPTION) {
				exit = true;
				}continue;
				}
		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong");
			continue;
			}
		String ageStr = JOptionPane.showInputDialog("Masukkan usia:");
		if (ageStr == null) {
			int choice = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?");
			if (choice == JOptionPane.YES_OPTION) {
				exit = true;
				}continue;
				}
		if (ageStr.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong");
			continue;
			}
		int age;
		try {
			age = Integer.parseInt(ageStr);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Isian usia harus angka");
				continue;
				}
		String address = JOptionPane.showInputDialog("Masukkan alamat:");
		if (address == null) {
			int choice = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?");
			if (choice == JOptionPane.YES_OPTION) {
				exit = true;
				}continue;
			}
		if (address.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong");
			continue;
			}
		if (address.length() < 10) {
			int choice = JOptionPane.showConfirmDialog(null, "Masukan alamat minimum 10 karakter. Lanjutkan?");
			if (choice != JOptionPane.YES_OPTION) {
				continue;
				}
			}
		bio.setData(name, age, address);
		JOptionPane.showMessageDialog(null, "Nama: " + bio.Fullname + "\nUsia: " + bio.Usia + "\nAlamat: " + bio.Alamat);
		int choice = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?");
		if (choice == JOptionPane.YES_OPTION) {
			exit = true;
			}
		}
	}
public void setData(String name, String ageStr, String address) {
	Fullname = name;
	Alamat = address;
	JOptionPane.showMessageDialog(null, "Nama: " + Fullname + "\nUsia: " + Usia + "\nAlamat: " + Alamat);
	}
}
