package org.example.level4_3;

import java.util.stream.IntStream;

public class EvenPenultimateDigitNumbers {

    /** Returns the numbers from 10 to 1000 whose second-to-last digit is even. */
    public int[] find() {
        return IntStream.rangeClosed(10, 1000)
                .filter(number -> number / 10 % 10 % 2 == 0)
                .toArray();
    }
}
