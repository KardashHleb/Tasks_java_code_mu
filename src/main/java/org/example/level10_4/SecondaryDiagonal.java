package org.example.level10_4;

public class SecondaryDiagonal {
    public int[] take(int[][] matrix) {
        int length = matrix.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = matrix[i][length - 1 - i];
            System.out.println(result[i]);
        }
        return result;
    }
}
