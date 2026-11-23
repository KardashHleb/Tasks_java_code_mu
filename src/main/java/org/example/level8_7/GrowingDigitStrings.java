package org.example.level8_7;

public class GrowingDigitStrings {
    public String[] make() {
        String[] result = new String[5];
        String row = "";

        for (int i = 1; i <= result.length; i++) {
            row = row + i;
            result[i - 1] = row;
            System.out.println(result[i - 1]);
        }

        return result;
    }
}
