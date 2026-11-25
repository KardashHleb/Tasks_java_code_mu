package org.example.level1_3;

public class NumbersFromOneToHundred {

    /** Returns the numbers from 1 to 100 in ascending order. */
    public int[] numbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
