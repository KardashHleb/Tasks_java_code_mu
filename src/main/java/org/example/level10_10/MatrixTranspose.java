package org.example.level10_10;

public class MatrixTranspose {
    public int[][] transpose(int[][] matrix) {
        int width = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > width) {
                width = matrix[i].length;
            }
        }
        int[][] result = new int[width][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if (j < result[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return result;
    }
}
