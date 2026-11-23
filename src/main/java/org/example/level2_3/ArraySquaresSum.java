package org.example.level2_3;

public class ArraySquaresSum {
    public int sumSquares(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] * arr[i];
        }

        System.out.println(sum);
        return sum;
    }
}
