package tugas_runtunan;

import java.util.Scanner;

public class latihan08 {
	public static void main(String[] args) {
		String npm, namaLengkap, namaKelas;
		int semester;
		float ipk;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan NMP: ");
		npm = input.nextLine();
		System.out.print("Masukan nama lengkap: ");
		namaLengkap = input.nextLine();
		System.out.print("Masukan nama kelas: ");
		namaKelas = input.nextLine();
		System.out.print("Masukan semester: ");
		semester = input.nextInt();
		System.out.print("Masukan IPK: ");
		ipk = input.nextFloat();
		
		System.out.println("\n=======Informasi Mahasiswa=======");
		System.out.println("NMP: "+npm);
		System.out.println("Nama Lengkap: "+namaLengkap);
		System.out.println("Nama Kelas: "+namaKelas);
		System.out.println("Semester: "+semester);
		System.out.println("IPK: "+ipk);
		
		input.close();
	}
}
