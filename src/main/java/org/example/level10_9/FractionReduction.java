package org.example.level10_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FractionReduction {

    private static final Pattern FRACTION = Pattern.compile("\\s*(-?\\d+)\\s*/\\s*(\\d+)\\s*");

    /**
     * Reduces a fraction step by step, each time dividing by the smallest prime factor of the
     * current GCD of numerator and denominator: "12/18" -> "12/18 = 6/9 = 2/3".
     */
    public String reduce(String fraction) {
        Matcher matcher = FRACTION.matcher(fraction);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid fraction: \"" + fraction + "\"");
        }
        int numerator = Integer.parseInt(matcher.group(1));
        int denominator = Integer.parseInt(matcher.group(2));
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be zero");
        }

        StringBuilder result = new StringBuilder().append(numerator).append('/').append(denominator);
        int divisor = gcd(numerator, denominator);
        while (divisor > 1) {
            int factor = smallestPrimeFactor(divisor);
            numerator /= factor;
            denominator /= factor;
            result.append(" = ").append(numerator).append('/').append(denominator);
            divisor /= factor;
        }
        return result.toString();
    }

    /** Euclid's algorithm. */
    private static int gcd(int first, int second) {
        int left = Math.abs(first);
        int right = Math.abs(second);
        while (right != 0) {
            int rest = left % right;
            left = right;
            right = rest;
        }
        return left;
    }

    private static int smallestPrimeFactor(int number) {
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return divisor;
            }
        }
        return number;
    }
}
