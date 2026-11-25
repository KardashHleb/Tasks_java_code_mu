package org.example.level6_2;

public class MirrorDigitsString {

    /** Builds the string "12345 54321". */
    public String build() {
        StringBuilder result = new StringBuilder();
        for (int digit = 1; digit <= 5; digit++) {
            result.append(digit);
        }
        result.append(' ');
        for (int digit = 5; digit >= 1; digit--) {
            result.append(digit);
        }
        return result.toString();
    }
}
