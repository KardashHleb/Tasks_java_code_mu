package org.example.level2_10;

public class LuckyTicketChecker {

    /** Checks whether the sum of the first three digits of a six-digit number equals the sum of the last three. */
    public boolean isLucky(int number) {
        if (number < 100_000 || number > 999_999) {
            throw new IllegalArgumentException("Number must have exactly six digits: " + number);
        }
        int firstSum = 0;
        int secondSum = 0;
        int rest = number;
        for (int i = 0; i < 6; i++) {
            int digit = rest % 10;
            if (i < 3) {
                secondSum += digit;
            } else {
                firstSum += digit;
            }
            rest /= 10;
        }
        return firstSum == secondSum;
    }
}
