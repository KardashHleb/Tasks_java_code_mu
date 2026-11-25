package org.example.level7_7;

import java.util.Random;

/** Generates random numbers from 1 to 10 so that two consecutive calls never return the same number. */
public class NonRepeatingRandom {

    private final Random random;
    private boolean hasLast;
    private int last;

    public NonRepeatingRandom() {
        this(new Random());
    }

    public NonRepeatingRandom(Random random) {
        this.random = random;
    }

    /** Returns a random number from 1 to 10 that differs from the previously returned one. */
    public int next() {
        int value = random.nextInt(10) + 1;
        while (hasLast && value == last) {
            value = random.nextInt(10) + 1;
        }
        hasLast = true;
        last = value;
        return value;
    }
}
