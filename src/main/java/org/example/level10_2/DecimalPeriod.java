package org.example.level10_2;

import java.util.HashMap;
import java.util.Map;

public class DecimalPeriod {

    /**
     * Returns the repeating part of the decimal expansion of numerator / denominator,
     * e.g. 1/7 -> "142857", 1/6 -> "6", or an empty string if the fraction terminates (1/4).
     */
    public String period(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be zero");
        }
        long divisor = Math.abs((long) denominator);
        long rest = Math.abs((long) numerator) % divisor;

        // Long division: a repeated remainder means the digits from its first occurrence repeat.
        Map<Long, Integer> firstPosition = new HashMap<>();
        StringBuilder digits = new StringBuilder();
        while (rest != 0 && !firstPosition.containsKey(rest)) {
            firstPosition.put(rest, digits.length());
            rest *= 10;
            digits.append(rest / divisor);
            rest %= divisor;
        }
        if (rest == 0) {
            return "";
        }
        return digits.substring(firstPosition.get(rest));
    }
}
