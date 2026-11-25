package org.example.level9_8;

import java.util.Random;

public class IntegerQuadratic {

    /** A generated equation together with its integer roots. */
    public record Equation(String text, int firstRoot, int secondRoot) {
    }

    /** Generates a reduced quadratic equation whose roots are random integers from -5 to 5. */
    public Equation generate(Random random) {
        int firstRoot = random.nextInt(11) - 5;
        int secondRoot = random.nextInt(11) - 5;
        return new Equation(format(firstRoot, secondRoot), firstRoot, secondRoot);
    }

    /** Builds the text of x^2 + bx + c = 0 with the given roots (Vieta: b = -(r1 + r2), c = r1 * r2). */
    public String format(int firstRoot, int secondRoot) {
        int linear = -(firstRoot + secondRoot);
        int free = firstRoot * secondRoot;
        return "x^2" + term(linear, "x") + term(free, "") + " = 0";
    }

    private static String term(int value, String suffix) {
        if (value == 0) {
            return "";
        }
        String sign = value < 0 ? " - " : " + ";
        int shown = Math.abs(value);
        if (!suffix.isEmpty() && shown == 1) {
            return sign + suffix;
        }
        return sign + shown + suffix;
    }
}
