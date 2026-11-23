package org.example.level10_1;

public class MainDiagonal {
    public int[] take(int[][] matrix) {
        int length = matrix.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = matrix[i][i];
            System.out.println(result[i]);
        }
        return result;
    }
}
