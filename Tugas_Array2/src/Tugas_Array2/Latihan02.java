package Tugas_Array2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<ArrayList<Integer>>();

        // Inisialisasi matriks A
        for (int i = 0; i < 2; i++) {
            matrixA.add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Masukkan nilai matriks A [" + i + "][" + j + "]:");
                int value = Integer.parseInt(input);
                matrixA.get(i).add(value);
            }
        }

        // Inisialisasi matriks B
        for (int i = 0; i < 2; i++) {
            matrixB.add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Masukkan nilai matriks B[" + i + "][" + j + "]:");
                int value = Integer.parseInt(input);
                matrixB.get(i).add(value);
            }
        }

        // Perhitungan matriks C
        ArrayList<ArrayList<Integer>> matrixC = multiplyMatrices(matrixA, matrixB);

        String result = "Matriks A:\n";
        result += matrixToString(matrixA);
        result += "\n\nMatriks B:\n";
        result += matrixToString(matrixB);
        result += "\n\nMatriks C (Hasil perkalian A dan B):\n";
        result += matrixToString(matrixC);

        JOptionPane.showMessageDialog(null, result);
    }

    public static ArrayList<ArrayList<Integer>> multiplyMatrices(ArrayList<ArrayList<Integer>> matrixA, ArrayList<ArrayList<Integer>> matrixB) {
        int rowsA = matrixA.size();
        int colsA = matrixA.get(0).size();
        int colsB = matrixB.get(0).size();

        ArrayList<ArrayList<Integer>> matrixC = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < rowsA; i++) {
            matrixC.add(new ArrayList<Integer>());
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrixA.get(i).get(k) * matrixB.get(k).get(j);
                }
                matrixC.get(i).add(sum);
            }
        }

        return matrixC;
    }

    public static String matrixToString(ArrayList<ArrayList<Integer>> matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                sb.append(matrix.get(i).get(j));
                if (j < matrix.get(i).size() - 1) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
