package org.example.level5_8;

public class TripleDigitsPyramid {
    public String make() {
        String result = "";

        for (int digit = 1; digit <= 9; digit++) {
            if (digit > 1) {
                result = result + "\n";
            }
            for (int i = 0; i < 3; i++) {
                result = result + digit;
            }
        }

        System.out.println(result);
        return result;
    }
}
