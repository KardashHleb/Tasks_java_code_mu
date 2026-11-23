package org.example.level10_2;

public class DecimalPeriod {
    public String period(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("деление на ноль");
            return "";
        }
        if (numerator < 0) {
            numerator = -numerator;
        }
        if (denominator < 0) {
            denominator = -denominator;
        }

        int rest = numerator % denominator;
        int[] seen = new int[denominator];
        for (int i = 0; i < seen.length; i++) {
            seen[i] = -1;
        }

        String digits = "";
        int position = 0;
        while (rest != 0 && seen[rest] < 0) {
            seen[rest] = position;
            rest = rest * 10;
            int digit = rest / denominator;
            digits = digits + digit;
            rest = rest % denominator;
            position = position + 1;
        }

        String result = "";
        if (rest == 0) {
            result = "";
            System.out.println("конечная дробь");
        } else {
            result = digits.substring(seen[rest]);
            System.out.println(result);
        }
        return result;
    }
}
