package org.example.level1_4;

public class EvenNumbersFromOneToHundred {

    /** Returns the even numbers from 1 to 100 in ascending order. */
    public int[] evenNumbers() {
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 2;
        }
        return numbers;
    }
}
