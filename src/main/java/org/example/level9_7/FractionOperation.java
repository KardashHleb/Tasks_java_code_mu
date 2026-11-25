package org.example.level9_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FractionOperation {

    private static final String FRACTION = "(-?\\d+)(?:/(\\d+))?";
    private static final Pattern EXPRESSION =
            Pattern.compile("\\s*" + FRACTION + "\\s*([-+*/])\\s*" + FRACTION + "\\s*");

    /** Evaluates an operation on two fractions, e.g. "1/2 + 1/3" -> "5/6"; the result is reduced. */
    public String calculate(String expression) {
        Matcher matcher = EXPRESSION.matcher(expression);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid expression: \"" + expression + "\"");
        }
        long leftNumerator = Long.parseLong(matcher.group(1));
        long leftDenominator = denominator(matcher.group(2));
        char operation = matcher.group(3).charAt(0);
        long rightNumerator = Long.parseLong(matcher.group(4));
        long rightDenominator = denominator(matcher.group(5));

        long numerator;
        long denominator;
        switch (operation) {
            case '+' -> {
                numerator = leftNumerator * rightDenominator + rightNumerator * leftDenominator;
                denominator = leftDenominator * rightDenominator;
            }
            case '-' -> {
                numerator = leftNumerator * rightDenominator - rightNumerator * leftDenominator;
                denominator = leftDenominator * rightDenominator;
            }
            case '*' -> {
                numerator = leftNumerator * rightNumerator;
                denominator = leftDenominator * rightDenominator;
            }
            default -> {
                if (rightNumerator == 0) {
                    throw new IllegalArgumentException("Division by zero: \"" + expression + "\"");
                }
                numerator = leftNumerator * rightDenominator;
                denominator = leftDenominator * rightNumerator;
            }
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        long divisor = gcd(Math.abs(numerator), denominator);
        return numerator / divisor + "/" + denominator / divisor;
    }

    private static long denominator(String text) {
        if (text == null) {
            return 1;
        }
        long value = Long.parseLong(text);
        if (value == 0) {
            throw new IllegalArgumentException("Denominator must not be zero");
        }
        return value;
    }

    /** Euclid's algorithm. */
    private static long gcd(long first, long second) {
        while (second != 0) {
            long rest = first % second;
            first = second;
            second = rest;
        }
        return first;
    }
}
