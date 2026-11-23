package org.example.level5_6;

public class SequentialMatrixBuilder {
    public int[][] build() {
        int[][] arr = new int[3][3];
        int value = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value;
                System.out.println(arr[i][j]);
                value = value + 1;
            }
        }

        return arr;
    }
}
