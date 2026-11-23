package org.example.level3_1;

public class DivisibleByFiveShower {
    public void printDivisibleByFive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
