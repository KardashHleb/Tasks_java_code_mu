package org.example.level5_10;

public class OddDigitsPyramid {

    /** Builds the rows 1, 333, 55555, 7777777, 999999999. */
    public String build() {
        StringBuilder result = new StringBuilder();
        for (int digit = 1; digit <= 9; digit += 2) {
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
