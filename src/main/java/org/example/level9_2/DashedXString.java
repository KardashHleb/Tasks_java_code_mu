package org.example.level9_2;

public class DashedXString {
    public String make() {
        String result = "-";
        String part = "";

        for (int i = 1; i <= 3; i++) {
            part = part + "x";
            result = result + part + "-";
        }
        for (int i = 2; i >= 1; i--) {
            part = "";
            for (int j = 0; j < i; j++) {
                part = part + "x";
            }
            result = result + part + "-";
        }

        System.out.println(result);
        return result;
    }
}
