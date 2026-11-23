package org.example.level5_2;

public class RisingDigitPyramid {
    public String make() {
        String result = "";

        for (int digit = 1; digit <= 5; digit++) {
            if (digit > 1) {
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
