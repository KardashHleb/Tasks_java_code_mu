package org.example.level10_7;

public class ColumnPicker {
    public int[] take(int[][] matrix, int column) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (column >= 0 && column < matrix[i].length) {
                result[i] = matrix[i][column];
            }
            System.out.println(result[i]);
        }
        return result;
    }
}
