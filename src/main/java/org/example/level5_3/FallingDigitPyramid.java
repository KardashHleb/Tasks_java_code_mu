package org.example.level5_3;

public class FallingDigitPyramid {

    /** Builds the rows 55555, 4444, 333, 22, 1. */
    public String build() {
        StringBuilder result = new StringBuilder();
        for (int digit = 5; digit >= 1; digit--) {
            if (digit < 5) {
                result.append('\n');
            }
            for (int i = 0; i < digit; i++) {
                result.append(digit);
            }
        }
        return result.toString();
    }
}
