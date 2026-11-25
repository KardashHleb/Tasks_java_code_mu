package org.example.level4_2;

import java.util.stream.IntStream;

public class EvenFirstDigitNumbers {

    /** Returns the numbers from 10 to 1000 whose first digit is even. */
    public int[] find() {
        return IntStream.rangeClosed(10, 1000)
                .filter(number -> firstDigit(number) % 2 == 0)
                .toArray();
    }

    private int firstDigit(int number) {
        int rest = number;
        while (rest >= 10) {
            rest = rest / 10;
        }
        return rest;
    }
}
