package org.example.level8_6;

public class XRowsArray {
    public String[] make() {
        String[] result = new String[5];
        String row = "";

        for (int i = 0; i < result.length; i++) {
            row = row + "x";
            result[i] = row;
            System.out.println(result[i]);
        }

        return result;
    }
}
