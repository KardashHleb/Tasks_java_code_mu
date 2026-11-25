package org.example.level4_1;

public class FirstDigitPosition {

    /** Returns the index of the first digit character in the string, or -1 if there is none. */
    public int findFirstDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current >= '0' && current <= '9') {
                return i;
            }
        }
        return -1;
    }
}
