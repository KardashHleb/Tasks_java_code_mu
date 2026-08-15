package org.example;

public class LastCharShower {
    public char showLastChar(String str) {
        int lastIndex = str.length() - 1;
        char lastChar = str.charAt(lastIndex);
        System.out.println(lastChar);
        return lastChar;
    }
}
