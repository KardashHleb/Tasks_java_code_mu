package org.example.level5_3;

public class FallingDigitPyramid {
    public String make() {
        String result = "";

        for (int digit = 5; digit >= 1; digit--) {
            if (digit < 5) {
                result = result + "\n";
            }
            for (int i = 0; i < digit; i++) {
                result = result + digit;
            }
        }

        System.out.println(result);
        return result;
    }
}
