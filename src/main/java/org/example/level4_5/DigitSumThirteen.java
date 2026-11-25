package org.example.level4_5;

import java.util.stream.IntStream;

public class DigitSumThirteen {

    /** Returns the numbers from 1 to 1000 whose digit sum equals 13. */
    public int[] find() {
        return IntStream.rangeClosed(1, 1000)
                .filter(number -> digitSum(number) == 13)
                .toArray();
    }

    private int digitSum(int number) {
        int rest = number;
        int sum = 0;
        while (rest > 0) {
            sum += rest % 10;
            rest = rest / 10;
        }
        return sum;
    }
}
