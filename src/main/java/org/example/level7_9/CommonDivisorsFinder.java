package org.example.level7_9;

public class CommonDivisorsFinder {
    public int[] find(int[] arr) {
        int min = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int positive = Math.abs(arr[i]);
            if (positive < min) {
                min = positive;
            }
        }

        int count = 0;
        for (int divisor = 1; divisor <= min; divisor++) {
            if (dividesAll(arr, divisor)) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int divisor = 1; divisor <= min; divisor++) {
            if (dividesAll(arr, divisor)) {
                result[index] = divisor;
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }

    private boolean dividesAll(int[] arr, int divisor) {
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) % divisor != 0) {
                return false;
            }
        }
        return true;
    }
}
