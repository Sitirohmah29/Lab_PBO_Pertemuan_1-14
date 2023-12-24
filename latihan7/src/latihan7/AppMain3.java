package latihan7;

public class AppMain3 {
	String namaLengkap;
	String namaDiubah;
	static vocal myname = new vocal();
	public static void main(String[] args) {
		String namaLengkap = "Siti Rohmah";
		System.out.println("Nama Lengkap: "+ namaLengkap);
		
		String namaDiubah = namaLengkap.replaceAll("[aiueoAIUEO]","X");
		System.out.println("Nama Lengkap Setelah Diubah: "+ namaDiubah);	
	}
}
