package org.example.level5_5;

public class NumberInRangeReader {

    /** Simulates asking for a number from 1 to 10 until one fits: returns the first attempt in range. */
    public int read(int... attempts) {
        for (int attempt : attempts) {
            if (attempt >= 1 && attempt <= 10) {
                return attempt;
            }
        }
        throw new IllegalArgumentException("None of the attempts is between 1 and 10");
    }
}
