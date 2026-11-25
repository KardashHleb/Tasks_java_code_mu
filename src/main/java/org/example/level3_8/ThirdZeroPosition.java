package org.example.level3_8;

public class ThirdZeroPosition {

    /** Returns the index of the third '0' character in the string, or -1 if there are fewer than three. */
    public int findThirdZero(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
                if (count == 3) {
                    return i;
                }
            }
        }
        return -1;
    }
}
