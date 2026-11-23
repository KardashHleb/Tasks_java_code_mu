package org.example.level3_9;

public class StringsCharsJoiner {
    public char[] joinChars(String[] arr) {
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            length = length + arr[i].length();
        }

        char[] chars = new char[length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                chars[index] = arr[i].charAt(j);
                System.out.println(chars[index]);
                index = index + 1;
            }
        }

        return chars;
    }
}
