package org.example.level3_5;

public class LastZeroInString {

    /** Returns the index of the last '0' character in the string, or -1 if there is none. */
    public int findLastZero(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                return i;
            }
        }
        return -1;
    }
}
