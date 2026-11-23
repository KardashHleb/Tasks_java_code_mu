package org.example.level10_6;

public class ZeroBelowDiagonal {
    public int[][] zero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length && j < i; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return matrix;
    }
}
