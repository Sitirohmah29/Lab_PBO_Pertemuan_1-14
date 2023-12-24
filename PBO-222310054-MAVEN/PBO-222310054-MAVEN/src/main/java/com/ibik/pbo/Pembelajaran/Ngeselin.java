//package com.ibik.pbo.Pembelajaran;
//
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
//public class Ngeselin {
//    public static void main(String[] args) {
//        ArrayList<Pengiriman> dataPengiriman = new ArrayList<>();
//
//        while (true) {
//            try {
//                double beratBarang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan berat barang (gram):"));
//                double jarakTempuh = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jarak tempuh (km):"));
//
//                Pengiriman pengiriman = new Pengiriman(beratBarang, jarakTempuh);
//                dataPengiriman.add(pengiriman);
//
//                JOptionPane.showMessageDialog(null, "Nomor Resi: " + pengiriman.getNomorResi() +
//                        "\nHarga Pengiriman: Rp " + pengiriman.hitungHarga());
//
//                int pilihan = JOptionPane.showConfirmDialog(null, "Ingin menambah pengiriman lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
//                if (pilihan != JOptionPane.YES_OPTION) {
//                    break;
//                }
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
//            }
//        }
//
//        JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan layanan PT. XYZ!");
//    }
//}
