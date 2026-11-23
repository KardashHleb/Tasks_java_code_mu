package org.example.level5_10;

public class ArrayNumbersReverser {
    public int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int temp = Math.abs(arr[i]);
            int reversed = 0;

            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp = temp / 10;
            }

            result[i] = reversed;
            System.out.println(result[i]);
        }

        return result;
    }
}
