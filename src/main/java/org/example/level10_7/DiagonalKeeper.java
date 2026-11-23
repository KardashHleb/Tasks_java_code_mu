package org.example.level10_7;

public class DiagonalKeeper {
    public int[][] keep(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean main = i == j;
                boolean secondary = i + j == size - 1;
                if (!main && !secondary) {
                    matrix[i][j] = 0;
                }
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
