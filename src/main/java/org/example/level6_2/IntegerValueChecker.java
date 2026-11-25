package org.example.level6_2;

public class IntegerValueChecker {

    /** Checks whether the text is an integer: an optional minus sign followed by digits only. */
    public boolean isInteger(String text) {
        int start = text.startsWith("-") ? 1 : 0;
        if (text.length() == start) {
            return false;
        }
        for (int i = start; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current < '0' || current > '9') {
                return false;
            }
        }
        return true;
    }
}
