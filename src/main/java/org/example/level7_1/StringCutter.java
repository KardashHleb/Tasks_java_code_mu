package org.example.level7_1;

public class StringCutter {

    /** Returns the first {@code length} characters of the text (the whole text if it is shorter). */
    public String cut(String text, int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + length);
        }
        return text.substring(0, Math.min(length, text.length()));
    }
}
