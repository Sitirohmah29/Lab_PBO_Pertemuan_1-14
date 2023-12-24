package kelompok4;

import java.util.Scanner; 

public class latihan08 { 
  
	    public static void main(String[] args) {
	    	String npm, namaLengkap, namaKelas;
	    	int semester;
	    	float ipk;
	        
	        Scanner Scanner = new Scanner(System.in);
	        
	        System.out.print("Masukkan NPM: ");
	        npm = Scanner.nextLine();
	       
	        System.out.print("Masukkan Nama Lengkap: ");
	        namaLengkap = Scanner.nextLine();
	        
	        System.out.print("Masukkan Nama Kelas: ");
	        namaKelas = Scanner.nextLine();
	        
	        System.out.print("Masukkan Semester: ");
	        semester = Scanner.nextInt();
	       
	        System.out.print("Masukkan IPK: ");
	        ipk = Scanner.nextFloat();

	        System.out.println("\n======Informasi Mahasiswa======");
	        System.out.println("NPM: " + npm);
	        System.out.println("Nama Lengkap: " + namaLengkap);
	        System.out.println("Nama Kelas: " + namaKelas);
	        System.out.println("Semester: " + semester);
	        System.out.println("IPK: " + ipk);

	        Scanner.close();
	    }
	}



