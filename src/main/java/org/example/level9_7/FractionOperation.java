package org.example.level9_7;

public class FractionOperation {
    public String calculate(String expression) {
        int[] left = readFraction(expression, 0);
        int position = left[2];
        while (position < expression.length() && expression.charAt(position) == ' ') {
            position = position + 1;
        }
        char operation = '+';
        if (position < expression.length()) {
            operation = expression.charAt(position);
            position = position + 1;
        }
        int[] right = readFraction(expression, position);

        int numerator = left[0];
        int denominator = left[1];
        if (operation == '+') {
            numerator = left[0] * right[1] + right[0] * left[1];
            denominator = left[1] * right[1];
        } else if (operation == '-') {
            numerator = left[0] * right[1] - right[0] * left[1];
            denominator = left[1] * right[1];
        } else if (operation == '*') {
            numerator = left[0] * right[0];
            denominator = left[1] * right[1];
        } else if (operation == '/' && right[0] != 0) {
            numerator = left[0] * right[1];
            denominator = left[1] * right[0];
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int divisor = gcd(numerator, denominator);
        if (divisor == 0) {
            divisor = 1;
        }
        numerator = numerator / divisor;
        denominator = denominator / divisor;

        String result = numerator + "/" + denominator;
        System.out.println(result);
        return result;
    }

    private int[] readFraction(String expression, int start) {
        int i = start;
        while (i < expression.length() && expression.charAt(i) == ' ') {
            i = i + 1;
        }
        int sign = 1;
        if (i < expression.length() && expression.charAt(i) == '-') {
            sign = -1;
            i = i + 1;
        }
        int numerator = 0;
        while (i < expression.length() && isDigit(expression.charAt(i))) {
            numerator = numerator * 10 + (expression.charAt(i) - '0');
            i = i + 1;
        }
        numerator = numerator * sign;
        int denominator = 1;
        if (i < expression.length() && expression.charAt(i) == '/') {
            i = i + 1;
            denominator = 0;
            while (i < expression.length() && isDigit(expression.charAt(i))) {
                denominator = denominator * 10 + (expression.charAt(i) - '0');
                i = i + 1;
            }
            if (denominator == 0) {
                denominator = 1;
            }
        }
        return new int[]{numerator, denominator, i};
    }

    private int gcd(int first, int second) {
        if (first < 0) {
            first = -first;
        }
        if (second < 0) {
            second = -second;
        }
        while (second != 0) {
            int rest = first % second;
            first = second;
            second = rest;
        }
        return first;
    }

    private boolean isDigit(char current) {
        return current >= '0' && current <= '9';
    }
}
