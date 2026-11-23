package org.example.level3_6;

public class LongNumbersShower {
    public void printLongNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) >= 1000) {
                System.out.println(arr[i]);
            }
        }
    }
}
