package org.example.level3_3;

public class ContainsZeroChecker {

    /** Checks whether the decimal notation of the number contains the digit 0. */
    public boolean containsZero(int number) {
        int rest = Math.abs(number);
        do {
            if (rest % 10 == 0) {
                return true;
            }
            rest = rest / 10;
        } while (rest > 0);
        return false;
    }
}
