package org.example.level10_9;

public class ColumnSwapper {
    public int[][] swap(int[][] matrix, int first, int second) {
        for (int i = 0; i < matrix.length; i++) {
            if (first >= 0 && second >= 0 && first < matrix[i].length && second < matrix[i].length) {
                int temp = matrix[i][first];
                matrix[i][first] = matrix[i][second];
                matrix[i][second] = temp;
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
