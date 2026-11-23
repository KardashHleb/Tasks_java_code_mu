package org.example.level7_9;

public class RowMaximums {
    public int[] maxima(int[][] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            System.out.println(result[i]);
        }

        return result;
    }
}
