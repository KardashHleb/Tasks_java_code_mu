package org.example.level1_4;

public class StringReverser {

    /** Returns the characters of the string in reverse order. */
    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        StringBuilder reversed = new StringBuilder(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
