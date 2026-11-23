package org.example.level10_5;

public class ZeroMainDiagonal {
    public int[][] zero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i < matrix[i].length) {
                matrix[i][i] = 0;
            }
        }
        print(matrix);
        return matrix;
    }

    private void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
