package org.example.level5_2;

import java.util.OptionalInt;

public class SecondWithDigitThree {

    /** Finds the second element of the array that contains the digit 3. */
    public OptionalInt find(int[] numbers) {
        int found = 0;
        for (int number : numbers) {
            if (containsThree(number)) {
                found++;
                if (found == 2) {
                    return OptionalInt.of(number);
                }
            }
        }
        return OptionalInt.empty();
    }

    private boolean containsThree(int number) {
        long value = Math.abs((long) number);
        while (value > 0) {
            if (value % 10 == 3) {
                return true;
            }
            value /= 10;
        }
        return false;
    }
}
