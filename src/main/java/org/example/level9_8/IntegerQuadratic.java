package org.example.level9_8;

import java.util.Random;

public class IntegerQuadratic {
    public String generate() {
        Random random = new Random();
        int firstRoot = random.nextInt(11) - 5;
        int secondRoot = random.nextInt(11) - 5;
        int linear = -(firstRoot + secondRoot);
        int free = firstRoot * secondRoot;

        String result = "x^2" + term(linear, "x") + term(free, "") + " = 0";
        System.out.println("корни: " + firstRoot + " " + secondRoot);
        System.out.println(result);
        return result;
    }

    private String term(int value, String suffix) {
        if (value == 0) {
            return "";
        }
        String sign = " + ";
        int shown = value;
        if (value < 0) {
            sign = " - ";
            shown = -value;
        }
        if (suffix.length() > 0 && shown == 1) {
            return sign + suffix;
        }
        return sign + shown + suffix;
    }
}
