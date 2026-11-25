package org.example.level1_5;

public class MultiplesOfThreeFromOneToHundred {

    /** Returns the multiples of three from 1 to 100 in ascending order. */
    public int[] multiplesOfThree() {
        int[] numbers = new int[100 / 3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 3;
        }
        return numbers;
    }
}
