package org.example.level3_7;

public class OddDigitsRemover {
    public int removeOddDigits(int number) {
        int positiveNumber = Math.abs(number);
        int temp = positiveNumber;
        int digits = 0;

        if (positiveNumber == 0) {
            digits = 1;
        }

        while (temp > 0) {
            digits = digits + 1;
            temp = temp / 10;
        }

        int divisor = 1;
        for (int i = 1; i < digits; i++) {
            divisor = divisor * 10;
        }

        int result = 0;
        temp = positiveNumber;

        while (divisor > 0) {
            int digit = temp / divisor % 10;
            if (digit % 2 == 0) {
                result = result * 10 + digit;
            }
            divisor = divisor / 10;
        }

        System.out.println(result);
        return result;
    }
}
