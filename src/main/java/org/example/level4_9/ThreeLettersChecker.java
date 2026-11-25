package org.example.level4_9;

public class ThreeLettersChecker {

    /** Checks whether the string contains at most three letters. */
    public boolean atMostThree(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        return count <= 3;
    }
}
