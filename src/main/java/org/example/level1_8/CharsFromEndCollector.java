package org.example.level1_8;

public class CharsFromEndCollector {

    /** Returns the characters of the string starting from the last one. */
    public char[] charsFromEnd(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(str.length() - 1 - i);
        }
        return chars;
    }
}
