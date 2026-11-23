package org.example.level5_5;

public class RepeatedRowsMatrix {
    public int[][] build() {
        int[][] arr = new int[5][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
                System.out.println(arr[i][j]);
            }
        }

        return arr;
    }
}
