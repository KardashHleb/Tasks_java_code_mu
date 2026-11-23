package org.example.level10_8;

public class RowSwapper {
    public int[][] swap(int[][] matrix, int first, int second) {
        if (first >= 0 && second >= 0 && first < matrix.length && second < matrix.length) {
            int[] temp = matrix[first];
            matrix[first] = matrix[second];
            matrix[second] = temp;
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
