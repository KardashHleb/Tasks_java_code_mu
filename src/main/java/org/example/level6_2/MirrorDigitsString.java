package org.example.level6_2;

public class MirrorDigitsString {
    public String make() {
        String result = "";

        for (int digit = 1; digit <= 5; digit++) {
            result = result + digit;
        }

        result = result + " ";

        for (int digit = 5; digit >= 1; digit--) {
            result = result + digit;
        }

        System.out.println(result);
        return result;
    }
}
