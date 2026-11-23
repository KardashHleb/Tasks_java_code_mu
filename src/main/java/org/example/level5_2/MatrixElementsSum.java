package org.example.level5_2;

public class MatrixElementsSum {
    public int sum(int[][] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result = result + arr[i][j];
            }
        }

        System.out.println(result);
        return result;
    }
}
