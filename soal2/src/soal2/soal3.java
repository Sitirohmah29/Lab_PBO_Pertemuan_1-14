package soal2;

import javax.swing.JOptionPane;

class soal3 {
	private String fullname;
    private int usia;
    private String alamat;

    public soal3(String fullname, int usia, String alamat) {
        this.fullname = fullname;
        this.usia = usia;
        this.alamat = alamat;
    }

    public boolean isFullnameValid() {
        return !fullname.isEmpty();
    }

    public boolean isUsiaValid() {
        try {
            Integer.parseInt(String.valueOf(usia));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isAlamatValid() {
        return alamat.length() >= 10;
    }

    public void validateData() {
        if (!isFullnameValid()) {
            JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isUsiaValid()) {
            JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isAlamatValid()) {
            JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Data diri valid:\nFullname: " + fullname + "\nUsia: " + usia + "\nAlamat: " + alamat);
        }
    }
    


    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog("Masukkan fullname:");
        String usiaStr = JOptionPane.showInputDialog("Masukkan usia:");
        int usia = 0;
        JOptionPane jop = new JOptionPane();
        
        try {
            usia = Integer.parseInt(usiaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String alamat = JOptionPane.showInputDialog("Masukkan alamat:");

        soal3 biodata = new soal3(fullname, usia, alamat);
        biodata.validateData();
    }
}
