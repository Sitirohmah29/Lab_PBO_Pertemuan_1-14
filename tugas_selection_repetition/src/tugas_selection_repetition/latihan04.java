package tugas_selection_repetition;  

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class latihan04{
    public static ArrayList<Integer> faktorisasi(int n) {
        ArrayList<Integer> faktor = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                faktor.add(i);
            }
        }
        return faktor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = input.nextInt();

        if (bilangan <= 0) {
            System.out.println("Bilangan yang anda masukan salah");
        } else {
            ArrayList<Integer> faktor = faktorisasi(bilangan);
            Collections.sort(faktor);

            System.out.print("Faktorisasi " + bilangan + " adalah: ");
            for (int i : faktor) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
