package org.example.level8_8;

public class DiamondDigitStrings {
    public String[] make() {
        String[] result = new String[9];

        for (int i = 0; i < result.length; i++) {
            int length = i + 1;
            if (i > 4) {
                length = 9 - i;
            }
            String row = "";
            for (int digit = 1; digit <= length; digit++) {
                row = row + digit;
            }
            result[i] = row;
            System.out.println(result[i]);
        }

        return result;
    }
}
