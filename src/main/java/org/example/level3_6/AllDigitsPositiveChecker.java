package org.example.level3_6;

public class AllDigitsPositiveChecker {

    /** Checks whether every digit of the number is greater than zero. */
    public boolean allDigitsPositive(int number) {
        int rest = Math.abs(number);
        do {
            if (rest % 10 == 0) {
                return false;
            }
            rest = rest / 10;
        } while (rest > 0);
        return true;
    }
}
