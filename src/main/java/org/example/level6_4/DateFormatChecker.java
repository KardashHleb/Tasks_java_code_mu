package org.example.level6_4;

public class DateFormatChecker {

    /** Checks whether the text has the format yyyy-mm-dd (digits only; the values themselves are not checked). */
    public boolean isCorrectFormat(String text) {
        if (text.length() != 10) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean separatorPosition = i == 4 || i == 7;
            if (separatorPosition ? current != '-' : current < '0' || current > '9') {
                return false;
            }
        }
        return true;
    }
}
