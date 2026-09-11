package org.example.level1_8;

public class CharsFromEndShower {
    public void showCharsFromEnd(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);
            System.out.println(currentChar);
        }
    }
}
