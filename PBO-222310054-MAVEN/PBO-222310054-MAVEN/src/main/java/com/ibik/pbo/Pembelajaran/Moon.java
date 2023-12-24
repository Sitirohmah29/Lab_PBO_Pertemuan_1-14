//package com.ibik.pbo.Pembelajaran;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//
//class Pengiriman {
//    private static int nomorResiCounter = 1000;
//
//    private String nomorResi;
//    private double beratBarang;
//    private double jarakTempuh;
//
//    public Pengiriman(double beratBarang, double jarakTempuh) {
//        this.nomorResi = "RESI" + nomorResiCounter++;
//        this.beratBarang = beratBarang;
//        this.jarakTempuh = jarakTempuh;
//    }
//
//    public double getBeratBarang() {
//        return beratBarang;
//    }
//
//    public double getJarakTempuh() {
//        return jarakTempuh;
//    }
//
//    public double hitungHarga() {
//        double hargaBerat = Math.ceil(beratBarang / 100) * 5000;
//        double hargaJarak = Math.ceil(jarakTempuh / 10) * 8000;
//        return hargaBerat + hargaJarak;
//    }
//
//    public String getNomorResi() {
//        return nomorResi;
//    }
//}
//
//public class Moon {
//    public static void main(String[] args) {
//        ArrayList<Pengiriman> dataPengiriman = new ArrayList<>();
//
//        while (true) {
//            // Menampilkan menu utama
//            String menuUtama = "Pilih menu:\n1. Input Pesanan\n2. Cek Nomor Resi\n3. Keluar";
//            int menuChoice = Integer.parseInt(JOptionPane.showInputDialog(menuUtama));
//
//            switch (menuChoice) {
//                case 1:
//                    // Input Pesanan
//                    inputPesanan(dataPengiriman);
//                    break;
//
//                case 2:
//                    // Cek Nomor Resi
//                    cekNomorResi(dataPengiriman);
//                    break;
//
//                case 3:
//                    // Keluar dari program
//                    JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan layanan PT. XYZ!");
//                    System.exit(0);
//
//                default:
//                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan pilih menu yang benar.");
//                    break;
//            }
//        }
//    }
//
//    private static void inputPesanan(ArrayList<Pengiriman> dataPengiriman) {
//        try {
//            double beratBarang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan berat barang (gram):"));
//            double jarakTempuh = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jarak tempuh (km):"));
//
//            Pengiriman pengiriman = new Pengiriman(beratBarang, jarakTempuh);
//            dataPengiriman.add(pengiriman);
//
//            JOptionPane.showMessageDialog(null, "Berat Barang: " + pengiriman.getBeratBarang() + "\nJarak Tempuh: "
//                    + pengiriman.getJarakTempuh() + "\nNomor Resi: " + pengiriman.getNomorResi() + "\nHarga Pengiriman: Rp "
//                    + pengiriman.hitungHarga());
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
//        }
//    }
//
//    private static void cekNomorResi(ArrayList<Pengiriman> dataPengiriman) {
//        String nomorResiCek = JOptionPane.showInputDialog("Masukkan nomor resi untuk cek pesanan:");
//        boolean dataDitemukan = false;
//
//        for (Pengiriman pengiriman : dataPengiriman) {
//            if (pengiriman.getNomorResi().equalsIgnoreCase(nomorResiCek)) {
//                JOptionPane.showMessageDialog(null, "Data ditemukan!\nBerat Barang: " + pengiriman.getBeratBarang()
//                        + "\nJarak Tempuh: " + pengiriman.getJarakTempuh() + "\nNomor Resi: " + pengiriman.getNomorResi()
//                        + "\nHarga Pengiriman: Rp " + pengiriman.hitungHarga());
//                dataDitemukan = true;
//                break;
//            }
//        }
//
//        if (!dataDitemukan) {
//            JOptionPane.showMessageDialog(null, "Error Info: Data tidak ditemukan.");
//        }
//    }
//}
