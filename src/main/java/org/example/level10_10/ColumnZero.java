package org.example.level10_10;

public class ColumnZero {
    public int[][] zero(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            if (column >= 0 && column < matrix[i].length) {
                matrix[i][column] = 0;
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
