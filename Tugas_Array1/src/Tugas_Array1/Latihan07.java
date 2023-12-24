package Tugas_Array1;

import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Masukkan nilai matriks A [" + i + "][" + j + "]:");
                matrix1[i][j] = Integer.parseInt(input);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Masukkan nilai matriks B[" + i + "][" + j + "]:");
                matrix2[i][j] = Integer.parseInt(input);
            }
        }
        
        int[][] matrixC = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixC[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        String result = "Matriks A:\n";
        result += matrixToString(matrix1);
        result += "\n\nMatriks B:\n";
        result += matrixToString(matrix2);
        result += "\n\nMatriks C (A - B):\n";
        result += matrixToString(matrixC);

        JOptionPane.showMessageDialog(null, result);
    }

    public static String matrixToString(int[][] matrix) { 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
