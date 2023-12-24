package UTS;

import java.util.Scanner;
public class UserMain {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User(user, Id_posisi, Nama_user,);

        System.out.print("Masukkan ID User: ");
        int idUser = input.nextInt();
        user.setId_user(idUser);

        input.nextLine(); // Membersihkan newline

        System.out.print("Masukkan Nama User: ");
        String namaUser = input.nextLine();
        user.setNama_user(namaUser);

        System.out.print("Masukkan ID Posisi: ");
        int idPosisi = input.nextInt();
        user.setId_posisi(idPosisi);

        input.nextLine(); // Membersihkan newline

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();
        user.setAlamat(alamat);

        // Mencetak data yang dimasukkan
        System.out.println("\nData yang Dimasukkan:");
        System.out.println("ID User: " + user.getId_user());
        System.out.println("Nama User: " + user.getNama_user());
        System.out.println("ID Posisi: " + user.getId_posisi());
        System.out.println("Alamat: " + user.getAlamat());
    }
}

