package org.example.level1_7;

public class PowersOfTwoGenerator {

    /** Returns the first {@code count} powers of two starting from 2 (2, 4, 8, ...). */
    public long[] powersOfTwo(int count) {
        if (count < 0 || count > 62) {
            throw new IllegalArgumentException("Count must be between 0 and 62: " + count);
        }
        long[] powers = new long[count];
        long power = 1;
        for (int i = 0; i < count; i++) {
            power *= 2;
            powers[i] = power;
        }
        return powers;
    }
}
