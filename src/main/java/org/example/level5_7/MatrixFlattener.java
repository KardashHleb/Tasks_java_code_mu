package org.example.level5_7;

public class MatrixFlattener {
    public int[] flatten(int[][] arr) {
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            length = length + arr[i].length;
        }

        int[] result = new int[length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[index] = arr[i][j];
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }
}
