package org.example.level5_1;

public class DuplicateDigitsChecker {

    /** Checks whether the number contains at least two equal digits. */
    public boolean hasDuplicateDigits(int number) {
        long value = Math.abs((long) number);
        boolean[] seen = new boolean[10];
        do {
            int digit = (int) (value % 10);
            if (seen[digit]) {
                return true;
            }
            seen[digit] = true;
            value /= 10;
        } while (value > 0);
        return false;
    }
}
