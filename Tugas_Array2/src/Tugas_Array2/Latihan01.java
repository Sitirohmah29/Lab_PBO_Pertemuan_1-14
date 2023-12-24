package Tugas_Array2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<ArrayList<Integer>>();

        // Inisialisasi matriks A
        for (int i = 0; i < 2; i++) {
            matrix1.add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Masukkan nilai matriks A [" + i + "][" + j + "]:");
                int value = Integer.parseInt(input);
                matrix1.get(i).add(value);
            }
        }

        // Inisialisasi matriks B
        for (int i = 0; i < 2; i++) {
            matrix2.add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Masukkan nilai matriks B[" + i + "][" + j + "]:");
                int value = Integer.parseInt(input);
                matrix2.get(i).add(value);
            }
        }

        String result = "Matriks A:\n";
        result += matrixToString(matrix1);
        result += "\n\nMatriks B:\n";
        result += matrixToString(matrix2);

        JOptionPane.showMessageDialog(null, result);
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
