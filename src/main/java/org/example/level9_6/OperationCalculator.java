package org.example.level9_6;

public class OperationCalculator {
    public int calculate(String expression) {
        int i = 0;
        while (i < expression.length() && expression.charAt(i) == ' ') {
            i = i + 1;
        }
        int sign = 1;
        if (i < expression.length() && expression.charAt(i) == '-') {
            sign = -1;
            i = i + 1;
        }
        int left = 0;
        while (i < expression.length() && isDigit(expression.charAt(i))) {
            left = left * 10 + (expression.charAt(i) - '0');
            i = i + 1;
        }
        left = left * sign;

        while (i < expression.length() && expression.charAt(i) == ' ') {
            i = i + 1;
        }
        char operation = '+';
        if (i < expression.length()) {
            operation = expression.charAt(i);
            i = i + 1;
        }
        while (i < expression.length() && expression.charAt(i) == ' ') {
            i = i + 1;
        }
        sign = 1;
        if (i < expression.length() && expression.charAt(i) == '-') {
            sign = -1;
            i = i + 1;
        }
        int right = 0;
        while (i < expression.length() && isDigit(expression.charAt(i))) {
            right = right * 10 + (expression.charAt(i) - '0');
            i = i + 1;
        }
        right = right * sign;

        int result = left;
        if (operation == '+') {
            result = left + right;
        } else if (operation == '-') {
            result = left - right;
        } else if (operation == '*') {
            result = left * right;
        } else if (operation == '/' && right != 0) {
            result = left / right;
        }

        System.out.println(result);
        return result;
    }

    private boolean isDigit(char current) {
        return current >= '0' && current <= '9';
    }
}
