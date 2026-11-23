package org.example.level7_6;

public class NumbersDivisors {
    public int[][] replace(int[] arr) {
        int[][] result = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            int positive = Math.abs(arr[i]);
            int count = 0;
            for (int divisor = 1; divisor <= positive; divisor++) {
                if (positive % divisor == 0) {
                    count = count + 1;
                }
            }

            result[i] = new int[count];
            int index = 0;
            for (int divisor = 1; divisor <= positive; divisor++) {
                if (positive % divisor == 0) {
                    result[i][index] = divisor;
                    System.out.println(result[i][index]);
                    index = index + 1;
                }
            }
        }

        return result;
    }
}
