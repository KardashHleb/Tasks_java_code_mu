package org.example.level3_8;

public class StringToCharArray {
    public char[] toChars(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
            System.out.println(chars[i]);
        }

        return chars;
    }
}
