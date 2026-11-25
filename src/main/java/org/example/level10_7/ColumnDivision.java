package org.example.level10_7;

import java.util.ArrayList;
import java.util.List;

public class ColumnDivision {

    /** Quotient, remainder and the lines of the long division. */
    public record Solution(long quotient, long remainder, List<String> steps) {
    }

    /** Integer quotient computed by long division (truncated toward zero, like Java's {@code /}). */
    public long divide(int dividend, int divisor) {
        return solve(dividend, divisor).quotient();
    }

    /**
     * Long division "in a column": digits of the dividend are brought down one by one, and each time
     * the current remainder is divided by the divisor, writing "current - product = new remainder".
     * For 1234 / 5: "1234 | 5", "12 - 10 = 2", "23 - 20 = 3", "34 - 30 = 4", "quotient = 246", "remainder = 4".
     * The remainder has the sign of the dividend, as with Java's {@code %}.
     */
    public Solution solve(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        long value = Math.abs((long) dividend);
        long by = Math.abs((long) divisor);
        List<String> steps = new ArrayList<>();
        steps.add(dividend + " | " + divisor);

        String digits = String.valueOf(value);
        long remainder = 0;
        long quotient = 0;
        boolean started = false;
        for (int i = 0; i < digits.length(); i++) {
            remainder = remainder * 10 + (digits.charAt(i) - '0');
            long digit = remainder / by;
            if (started || digit > 0 || i == digits.length() - 1) {
                long product = digit * by;
                steps.add(remainder + " - " + product + " = " + (remainder - product));
                remainder -= product;
                started = true;
            }
            quotient = quotient * 10 + digit;
        }

        if ((dividend < 0) != (divisor < 0)) {
            quotient = -quotient;
        }
        if (dividend < 0) {
            remainder = -remainder;
        }
        steps.add("quotient = " + quotient);
        steps.add("remainder = " + remainder);
        return new Solution(quotient, remainder, List.copyOf(steps));
    }
}
