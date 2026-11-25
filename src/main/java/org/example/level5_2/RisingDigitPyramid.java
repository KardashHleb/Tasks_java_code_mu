package org.example.level5_2;

public class RisingDigitPyramid {

    /** Builds the rows 1, 22, 333, 4444, 55555. */
    public String build() {
        StringBuilder result = new StringBuilder();
        for (int digit = 1; digit <= 5; digit++) {
            if (digit > 1) {
                result.append('\n');
            }
            for (int i = 0; i < digit; i++) {
                result.append(digit);
            }
        }
        return result.toString();
    }
}
