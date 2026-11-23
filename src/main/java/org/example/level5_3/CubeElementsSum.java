package org.example.level5_3;

public class CubeElementsSum {
    public int sum(int[][][] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    result = result + arr[i][j][k];
                }
            }
        }

        System.out.println(result);
        return result;
    }
}
