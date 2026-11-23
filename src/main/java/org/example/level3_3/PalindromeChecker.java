package org.example.level3_3;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                System.out.println("Не палиндром");
                return false;
            }
            left = left + 1;
            right = right - 1;
        }

        System.out.println("Палиндром");
        return true;
    }
}
