package org.example.level2_1;

public class EvenDigitsSumFinder {

    /** Returns the sum of the even digits of the number (the sign is ignored). */
    public int sumEvenDigits(int number) {
        long rest = Math.abs((long) number);
        int sum = 0;
        while (rest > 0) {
            int lastDigit = (int) (rest % 10);
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            rest /= 10;
        }
        return sum;
    }
}
