package org.example.level10_10;

public class MinMaxSwap {
    public int[][] swap(int[][] matrix) {
        int minRow = 0;
        int minColumn = 0;
        int maxRow = 0;
        int maxColumn = 0;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!found) {
                    minRow = i;
                    minColumn = j;
                    maxRow = i;
                    maxColumn = j;
                    found = true;
                }
                if (matrix[i][j] < matrix[minRow][minColumn]) {
                    minRow = i;
                    minColumn = j;
                }
                if (matrix[i][j] > matrix[maxRow][maxColumn]) {
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        if (found) {
            int temp = matrix[minRow][minColumn];
            matrix[minRow][minColumn] = matrix[maxRow][maxColumn];
            matrix[maxRow][maxColumn] = temp;
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
