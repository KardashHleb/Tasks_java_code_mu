package org.example.level10_3;

public class LuckyDigitTicket {

    /**
     * Checks whether six digits can be rearranged into a lucky ticket (sum of the first three equals
     * the sum of the last three). That is the case exactly when some three of the digits add up to
     * half of the total, so all 20 ways to choose three positions are tried.
     */
    public boolean canBeLucky(int[] digits) {
        if (digits.length != 6) {
            throw new IllegalArgumentException("A ticket must have 6 digits, got " + digits.length);
        }
        int total = 0;
        for (int digit : digits) {
            if (digit < 0 || digit > 9) {
                throw new IllegalArgumentException("Not a digit: " + digit);
            }
            total += digit;
        }
        if (total % 2 != 0) {
            return false;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = j + 1; k < 6; k++) {
                    if (digits[i] + digits[j] + digits[k] == total / 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
