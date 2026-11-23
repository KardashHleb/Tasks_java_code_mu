package org.example.level10_8;

public class ColumnSums {
    public int[] sum(int[][] matrix) {
        int width = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > width) {
                width = matrix[i].length;
            }
        }
        int[] result = new int[width];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j] = result[j] + matrix[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}
