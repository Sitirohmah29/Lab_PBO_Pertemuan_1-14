package Quiz_Kelas;

public class Book {
	String judul;
	String penulis;
	String penerbit;
	int tahun_terbit;
	
	public Book(String judul, String penulis, String penerbit, int tahun_terbit ) {
		this.judul = judul;
		this.penulis = penulis;
		this.penerbit = penerbit;
		this.tahun_terbit = tahun_terbit;
	}
	
	public String getjudul() {
		return judul;
		}
	public void setjudul(String judul) {
		this.judul = judul;
	}
	public String getpenulis() {
		return penulis;
	}
	public void setpenulis(String penulis) {
		this.penulis = penulis;
	}
	public String getpenerbit() {
		return penerbit;
	}
	public void setpenerbit(String penerbit) {
		this.penerbit = penerbit;
	}
	public Integer gettahun_terbit() {
		return tahun_terbit;
	}
	public void settahun_terbit (Integer tahun_terbit) {
		this.tahun_terbit = tahun_terbit;
	}
}
