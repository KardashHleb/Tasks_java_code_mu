package org.example.level4_4;

public class DigitCharsToInt {

    /** Combines an array of digit characters into a number, e.g. {'1', '2', '3'} gives 123. */
    public int toInt(char[] digits) {
        if (digits.length == 0) {
            throw new IllegalArgumentException("Array of digits must not be empty");
        }
        int result = 0;
        for (char digit : digits) {
            if (digit < '0' || digit > '9') {
                throw new IllegalArgumentException("Not a digit: '" + digit + "'");
            }
            result = result * 10 + (digit - '0');
        }
        return result;
    }
}
