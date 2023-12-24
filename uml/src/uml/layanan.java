package uml;

import java.util.ArrayList;

class layanan {
	    private String jenisLayanan;
	    private String tanggal;
	    private double estimasiBiaya;
	    private boolean selesai;

	    public layanan(String jenisLayanan, String tanggal, double estimasiBiaya) {
	        this.jenisLayanan = jenisLayanan;
	        this.tanggal = tanggal;
	        this.estimasiBiaya = estimasiBiaya;
	        this.selesai = false;
	    }

	    public String getJenisLayanan() {
	        return jenisLayanan;
	    }

	    public String getTanggal() {
	        return tanggal;
	    }

	    public double getEstimasiBiaya() {
	        return estimasiBiaya;
	    }

	    public boolean isSelesai() {
	        return selesai;
	    }

	    public void setSelesai(boolean selesai) {
	        this.selesai = selesai;
	    }
	}

	class Pelanggan {
	    private String nama;
	    private ArrayList<layanan> riwayatLayanan = new ArrayList<>();

	    public Pelanggan(String nama) {
	        this.nama = nama;
	    }

	    public String getNama() {
	        return nama;
	    }

	    public void tambahLayanan(String jenisLayanan, String tanggal, double estimasiBiaya) {
	        layanan layanan = new layanan(jenisLayanan, tanggal, estimasiBiaya);
	        riwayatLayanan.add(layanan);
	    }

	    public ArrayList<layanan> getRiwayatLayanan() {
	        return riwayatLayanan;
	    }
	}

