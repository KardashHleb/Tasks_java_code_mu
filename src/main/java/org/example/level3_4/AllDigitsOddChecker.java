package org.example.level3_4;

public class AllDigitsOddChecker {

    /** Checks whether every digit of the number is odd. */
    public boolean allDigitsOdd(int number) {
        int rest = Math.abs(number);
        do {
            if (rest % 10 % 2 == 0) {
                return false;
            }
            rest = rest / 10;
        } while (rest > 0);
        return true;
    }
}
