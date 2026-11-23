package org.example.level5_5;

public class OddLettersCapitalizer {
    public String capitalizeOdd(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if ((i + 1) % 2 != 0) {
                result = result + Character.toUpperCase(current);
            } else {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
