package soal2;

public class Biodata {
	String fullname;
	int usia;
	String alamat;
	
	String ShowName(String nama) {
		fullname = nama;
		return fullname;
	}
	int ShowUsia(int age) {
		usia = age;
		return usia;
	}
	String ShowAlamat(String Alamat) {
		alamat = Alamat;
		return alamat;
	}
}
