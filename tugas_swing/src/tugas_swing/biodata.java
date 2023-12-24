package tugas_swing;

public class biodata {
	String fullname;
	String alamat;
	int usia;
	
	String showfullname(String nama) {
		fullname = nama;
		return fullname;
	}
	Integer showusia(int umur) {
		usia = umur;
		return usia;
	}
	String showalamat(String Alamat) {
		alamat = Alamat;
		return alamat;
	}
}
