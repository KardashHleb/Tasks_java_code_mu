package org.example.level5_7;

import java.util.stream.IntStream;

public class FirstTwoDigitsSumFive {

    /** Finds all numbers from 10 to 1000 whose first two digits add up to 5. */
    public int[] find() {
        return IntStream.rangeClosed(10, 1000)
                .filter(number -> firstTwoDigitsSum(number) == 5)
                .toArray();
    }

    private int firstTwoDigitsSum(int number) {
        int reduced = number;
        while (reduced >= 100) {
            reduced /= 10;
        }
        return reduced / 10 + reduced % 10;
    }
}
