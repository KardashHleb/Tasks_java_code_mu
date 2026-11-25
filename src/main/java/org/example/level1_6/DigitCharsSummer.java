package org.example.level1_6;

public class DigitCharsSummer {

    /** Returns the sum of the numeric values of three digit characters. */
    public int sumDigitChars(char chr1, char chr2, char chr3) {
        return digitValue(chr1) + digitValue(chr2) + digitValue(chr3);
    }

    private static int digitValue(char chr) {
        if (chr < '0' || chr > '9') {
            throw new IllegalArgumentException("Character is not a digit: " + chr);
        }
        return chr - '0';
    }
}
