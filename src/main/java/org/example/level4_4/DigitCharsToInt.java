package org.example.level4_4;

public class DigitCharsToInt {
    public int merge(char[] digits) {
        int result = 0;

        for (int i = 0; i < digits.length; i++) {
            result = result * 10 + (digits[i] - '0');
        }

        System.out.println(result);
        return result;
    }
}
