package org.example.level1_2;

public class FirstDigitsChecker {

    /** Checks whether two numbers start with the same digit (signs are ignored). */
    public boolean haveSameFirstDigit(int number1, int number2) {
        return firstDigit(number1) == firstDigit(number2);
    }

    private static char firstDigit(int number) {
        return Long.toString(Math.abs((long) number)).charAt(0);
    }
}
