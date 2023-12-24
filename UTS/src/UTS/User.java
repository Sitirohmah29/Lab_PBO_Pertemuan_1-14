package UTS;

public class User {
	private Integer Id_user;
	private Integer Id_posisi;
	private String Nama_user;
	private String Alamat;
	
	public User(Integer Id_user, Integer Id_posisi, String Nama_user, String Alamat) {
		this.Id_user = Id_user;
		this.Id_posisi = Id_posisi;
		this.Nama_user = Nama_user;
		this.Alamat = Alamat;
	}
	
	public void setId_user(Integer Id_user) {
		this.Id_user = Id_user;
	}
	public Integer getId_user() {
		return Id_user;
	}
	public void setId_posisi(Integer Id_posisi) {
		this.Id_posisi = Id_posisi;
	}
	public Integer getId_posisi() {
		return Id_posisi;
	}
	public void setNama_user(String Nama_user) {
		this.Nama_user = Nama_user;
	}
	public String getNama_user() {
		return Nama_user;
	}
	public void setAlamat(String Alamat) {
		this.Alamat = Alamat;
	}
	public String getAlamat() {
		return Alamat;
	}
	
}
