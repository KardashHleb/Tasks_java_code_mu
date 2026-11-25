package org.example.level2_2;

import java.util.ArrayList;
import java.util.List;

public class DigitsFromEndCollector {

    /** Returns the digits of the number starting from the last one (the sign is ignored). */
    public List<Integer> digitsFromEnd(int number) {
        long rest = Math.abs((long) number);
        List<Integer> digits = new ArrayList<>();
        do {
            digits.add((int) (rest % 10));
            rest /= 10;
        } while (rest > 0);
        return digits;
    }
}
