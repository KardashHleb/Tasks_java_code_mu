package org.example;

public class FirstTwoLettersChecker {

    public boolean sameFirstTwoLetters(String word1, String word2) {
        String start1 = word1.substring(0, 2);
        String start2 = word2.substring(0, 2);

        if (start1.equals(start2)) {
            System.out.println("Первые две буквы совпадают");
            return true;
        } else {
            System.out.println("Первые две буквы не совпадают");
            return false;
        }
    }
}
