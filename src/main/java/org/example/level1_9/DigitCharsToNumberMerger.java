package org.example.level1_9;

public class DigitCharsToNumberMerger {

    /** Builds a number from three digit characters, e.g. '1', '2', '3' gives 123. */
    public int mergeToNumber(char chr1, char chr2, char chr3) {
        return digitValue(chr1) * 100 + digitValue(chr2) * 10 + digitValue(chr3);
    }

    private static int digitValue(char chr) {
        if (chr < '0' || chr > '9') {
            throw new IllegalArgumentException("Character is not a digit: " + chr);
        }
        return chr - '0';
    }
}
