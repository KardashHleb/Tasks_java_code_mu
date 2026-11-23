package org.example.level5_4;

public class FirstDigitsCollector {
    public byte[] collect(int[] arr) {
        byte[] result = new byte[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int first = Math.abs(arr[i]);
            while (first >= 10) {
                first = first / 10;
            }
            result[i] = (byte) first;
            System.out.println(result[i]);
        }

        return result;
    }
}
