package latihan02;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
        nyob biodata = new nyob();

        // Input Fullname
        String fullName = JOptionPane.showInputDialog("Masukkan Nama Lengkap:");
        biodata.setFullName(fullName);

        // Input Usia
        String ageStr = JOptionPane.showInputDialog("Masukkan Usia:");
        int age = Integer.parseInt(ageStr);
        biodata.setAge(age);

        // Input Alamat
        String address = JOptionPane.showInputDialog("Masukkan Alamat:");
        biodata.setAddress(address);

        // Menampilkan data menggunakan showMessageDialog
        String message = "Nama: " + biodata.getFullName() + "\nUsia: " + biodata.getAge() + "\nAlamat: " + biodata.getAddress();
        JOptionPane.showMessageDialog(null, message, "Data Diri", JOptionPane.PLAIN_MESSAGE);
    }
}
