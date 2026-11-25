package org.example.level4_6;

public class OnlyDigitsChecker {

    /** Checks whether the non-empty string consists of the digits 0-9 only. */
    public boolean onlyDigits(String str) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current < '0' || current > '9') {
                return false;
            }
        }
        return true;
    }
}
