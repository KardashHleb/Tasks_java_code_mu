package org.example.level5_8;

public class RowsSorter {
    public int[][] sortRows(int[][] arr) {
        int[][] result = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }

            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < result[i].length - 1; k++) {
                    if (result[i][k] > result[i][k + 1]) {
                        int temp = result[i][k];
                        result[i][k] = result[i][k + 1];
                        result[i][k + 1] = temp;
                    }
                }
            }

            String row = "";
            for (int j = 0; j < result[i].length; j++) {
                if (j > 0) {
                    row = row + " ";
                }
                row = row + result[i][j];
            }
            System.out.println(row);
        }

        return result;
    }
}
