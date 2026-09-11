package org.example.level1_9;

public class LastAndFirstLetterChecker {
    public boolean sameLastAndFirstLetter(String word1, String word2) {
        char lastLetter = word1.charAt(word1.length() - 1);
        char firstLetter = word2.charAt(0);

        if (lastLetter == firstLetter) {
            System.out.println("Буквы совпадают");
            return true;
        } else {
            System.out.println("Буквы не совпадают");
            return false;
        }
    }
}
