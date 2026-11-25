package org.example.level5_10;

public class LinesToArray {

    /** Splits a multi-line text into an array of its non-empty lines. */
    public String[] split(String text) {
        return text.lines()
                .filter(line -> !line.isEmpty())
                .toArray(String[]::new);
    }
}
