package org.example.level9_5;

public class PairsGridString {
    public String make() {
        String result = "";

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (result.length() > 0) {
                    result = result + " ";
                }
                result = result + i + j;
            }
        }

        System.out.println(result);
        return result;
    }
}
