package org.example.level8_9;

public class DoubledDigitsArray {
    public int[] make() {
        int[] result = new int[5];

        for (int i = 0; i < result.length; i++) {
            int first = i * 2 + 1;
            int second = i * 2 + 2;
            if (second == 10) {
                second = 0;
            }
            result[i] = first * 10 + second;
            System.out.println(result[i]);
        }

        return result;
    }
}
