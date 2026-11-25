package org.example.level3_3;

public class PalindromeChecker {

    /** Checks whether the word reads the same in both directions (case-sensitive). */
    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
