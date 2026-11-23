package org.example.level7_1;

public class StringCutter {
    public String cut(int length, String str) {
        if (length < 0) {
            length = 0;
        }
        if (length > str.length()) {
            length = str.length();
        }

        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
        return result;
    }
}
