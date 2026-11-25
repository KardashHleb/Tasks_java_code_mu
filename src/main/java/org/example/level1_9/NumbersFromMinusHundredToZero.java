package org.example.level1_9;

public class NumbersFromMinusHundredToZero {

    /** Returns the numbers from -100 to 0 in ascending order. */
    public int[] numbers() {
        int[] numbers = new int[101];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i - 100;
        }
        return numbers;
    }
}
