package Tugas_Array1;
 
public class Latihan02 {
	public static void main(String[] args) {
        int[] nilaiArray = new int[5];
        for (int i = 0; i < nilaiArray.length; i++) {
            nilaiArray[i] = i * 5;
        }
        System.out.println("Nilai Array:");
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.println("nilaiArray[" + i + "] = " + nilaiArray[i]);
        }
    }
}
