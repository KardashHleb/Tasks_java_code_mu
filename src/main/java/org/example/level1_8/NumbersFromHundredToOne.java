package org.example.level1_8;

public class NumbersFromHundredToOne {

    /** Returns the numbers from 100 down to 1. */
    public int[] numbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 - i;
        }
        return numbers;
    }
}
