package org.example.level5_1;

public class MatrixElementsPrinter {
    public int[][] printAll(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        return arr;
    }
}
