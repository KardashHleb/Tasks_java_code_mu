package org.example.level3_7;

public class EvenDigitsStringChecker {

    /** Checks whether the non-empty string consists of even digits only. */
    public boolean onlyEvenDigits(String str) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current < '0' || current > '9' || (current - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
