package org.example.level4_8;

public class TwoCapitalsChecker {

    /** Checks whether the string contains at most two uppercase letters. */
    public boolean atMostTwo(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count <= 2;
    }
}
