package org.example.level3_4;

public class NegativeCount {
    public int countNegative(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count = count + 1;
            }
        }

        System.out.println(count);
        return count;
    }
}
