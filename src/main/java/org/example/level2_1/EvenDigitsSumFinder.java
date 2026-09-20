package org.example.level2_1;

public class EvenDigitsSumFinder {
    public int sumEvenDigits(int number) {
        int positiveNumber = Math.abs(number);
        int sum = 0;

        while (positiveNumber > 0) {
            int lastDigit = positiveNumber % 10;
            if (lastDigit % 2 == 0) {
                sum = sum + lastDigit;
            }
            positiveNumber = positiveNumber / 10;
        }

        System.out.println(sum);
        return sum;
    }
}
