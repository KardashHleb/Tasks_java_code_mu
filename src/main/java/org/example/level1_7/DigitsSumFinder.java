package org.example.level1_7;

public class DigitsSumFinder {
    public int sumDigits(int number) {
        int positiveNumber = Math.abs(number);
        int sum = 0;

        while (positiveNumber > 0) {
            int lastDigit = positiveNumber % 10;
            sum = sum + lastDigit;
            positiveNumber = positiveNumber / 10;
        }

        System.out.println(sum);
        return sum;
    }
}
