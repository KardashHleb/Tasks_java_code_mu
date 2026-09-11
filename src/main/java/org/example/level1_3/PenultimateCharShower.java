package org.example.level1_3;

public class PenultimateCharShower {
    public char showPenultimateChar(String str) {
        if (str.length() > 1) {
            char penultimateChar = str.charAt(str.length() - 2);
            System.out.println(penultimateChar);
            return penultimateChar;
        }
        return '\0';
    }
}
