package org.example.level7_5;

public class DigitsOnlyChecker {

    /** Returns true if the text is non-empty and consists of the digits 0-9 only. */
    public boolean containsOnlyDigits(String text) {
        if (text.isEmpty()) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current < '0' || current > '9') {
                return false;
            }
        }
        return true;
    }
}
