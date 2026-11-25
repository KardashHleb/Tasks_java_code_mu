package org.example.level5_8;

public class TripleDigitsPyramid {

    /** Builds nine rows 111, 222, ..., 999. */
    public String build() {
        StringBuilder result = new StringBuilder();
        for (int digit = 1; digit <= 9; digit++) {
            if (digit > 1) {
                result.append('\n');
            }
            for (int i = 0; i < 3; i++) {
                result.append(digit);
            }
        }
        return result.toString();
    }
}
