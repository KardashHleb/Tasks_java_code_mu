package org.example.level1_2;

public class FirstAndLastDigitSum {

    /** Returns the sum of the first and the last digit of the number (the sign is ignored). */
    public int sumFirstAndLast(int number) {
        String digits = Long.toString(Math.abs((long) number));
        int firstDigit = digits.charAt(0) - '0';
        int lastDigit = digits.charAt(digits.length() - 1) - '0';
        return firstDigit + lastDigit;
    }
}
