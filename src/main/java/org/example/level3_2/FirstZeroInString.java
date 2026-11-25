package org.example.level3_2;

public class FirstZeroInString {

    /** Returns the index of the first '0' character in the string, or -1 if there is none. */
    public int findFirstZero(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                return i;
            }
        }
        return -1;
    }
}
