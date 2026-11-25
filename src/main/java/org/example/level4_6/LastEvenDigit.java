package org.example.level4_6;

import java.util.OptionalInt;

public class LastEvenDigit {

    /** Returns the last (rightmost) even digit of the number, or an empty result if all digits are odd. */
    public OptionalInt find(int number) {
        int rest = Math.abs(number);
        do {
            int digit = rest % 10;
            if (digit % 2 == 0) {
                return OptionalInt.of(digit);
            }
            rest = rest / 10;
        } while (rest > 0);
        return OptionalInt.empty();
    }
}
