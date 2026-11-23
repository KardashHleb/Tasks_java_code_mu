package org.example.level10_7;

public class ColumnDivision {
    public int divide(int dividend, int divisor) {
        System.out.println(dividend + " | " + divisor);
        if (divisor == 0) {
            System.out.println("деление на ноль");
            return 0;
        }

        int value = dividend;
        int by = divisor;
        if (value < 0) {
            value = -value;
        }
        if (by < 0) {
            by = -by;
        }

        String digits = "" + value;
        int remainder = 0;
        String quotient = "";
        for (int i = 0; i < digits.length(); i++) {
            remainder = remainder * 10 + (digits.charAt(i) - '0');
            int quote = remainder / by;
            if (quotient.length() > 0 || quote > 0 || i == digits.length() - 1) {
                int product = quote * by;
                System.out.println(remainder + " - " + product + " = " + (remainder - product));
                remainder = remainder - product;
                quotient = quotient + quote;
            }
        }

        int result = 0;
        for (int i = 0; i < quotient.length(); i++) {
            result = result * 10 + (quotient.charAt(i) - '0');
        }
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            result = -result;
        }
        System.out.println("частное " + result);
        System.out.println("остаток " + remainder);
        return result;
    }
}
