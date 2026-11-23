package org.example.level10_9;

public class FractionReduction {
    public String reduce(String fraction) {
        int slash = fraction.indexOf('/');
        int numerator = toInt(fraction.substring(0, slash));
        int denominator = toInt(fraction.substring(slash + 1));
        String result = numerator + "/" + denominator;

        int divisor = gcd(numerator, denominator);
        while (divisor > 1) {
            int factor = 2;
            while (divisor % factor != 0) {
                factor = factor + 1;
            }
            numerator = numerator / factor;
            denominator = denominator / factor;
            result = result + " = " + numerator + "/" + denominator;
            divisor = gcd(numerator, denominator);
        }

        System.out.println(result);
        return result;
    }

    private int toInt(String text) {
        int value = 0;
        int sign = 1;
        int i = 0;
        if (text.length() > 0 && text.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }
        while (i < text.length()) {
            value = value * 10 + (text.charAt(i) - '0');
            i = i + 1;
        }
        return value * sign;
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
}
