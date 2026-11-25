package org.example.level9_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperationCalculator {

    private static final Pattern EXPRESSION = Pattern.compile("\\s*(-?\\d+)\\s*([-+*/])\\s*(-?\\d+)\\s*");

    /** Evaluates an expression of two integers and one operation, e.g. "12 * -3"; division is integer division. */
    public int calculate(String expression) {
        Matcher matcher = EXPRESSION.matcher(expression);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid expression: \"" + expression + "\"");
        }
        int left = Integer.parseInt(matcher.group(1));
        int right = Integer.parseInt(matcher.group(3));
        return switch (matcher.group(2).charAt(0)) {
            case '+' -> left + right;
            case '-' -> left - right;
            case '*' -> left * right;
            default -> {
                if (right == 0) {
                    throw new IllegalArgumentException("Division by zero: \"" + expression + "\"");
                }
                yield left / right;
            }
        };
    }
}
