package org.example.level6_2;

public class PairSubarraysPrinter {
    public int[][] print(int[] arr) {
        int[][] result = new int[arr.length / 2][2];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i = i + 2) {
            result[index][0] = arr[i];
            result[index][1] = arr[i + 1];
            System.out.println(result[index][0] + " " + result[index][1]);
            index = index + 1;
        }

        return result;
    }
}
