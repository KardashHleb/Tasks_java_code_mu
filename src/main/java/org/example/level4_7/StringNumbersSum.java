package org.example.level4_7;

public class StringNumbersSum {
    public int sum(String[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
        return sum;
    }
}
