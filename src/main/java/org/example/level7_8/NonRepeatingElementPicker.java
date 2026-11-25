package org.example.level7_8;

import java.util.Random;

/** Picks random array elements so that two consecutive picks differ whenever the array allows it. */
public class NonRepeatingElementPicker {

    private final Random random;
    private boolean hasLast;
    private int last;

    public NonRepeatingElementPicker() {
        this(new Random());
    }

    public NonRepeatingElementPicker(Random random) {
        this.random = random;
    }

    /** Returns a random element of the array that differs from the previous pick if such an element exists. */
    public int pick(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        boolean hasOther = !hasLast;
        for (int i = 0; i < values.length && !hasOther; i++) {
            hasOther = values[i] != last;
        }
        int index = random.nextInt(values.length);
        while (hasLast && hasOther && values[index] == last) {
            index = random.nextInt(values.length);
        }
        last = values[index];
        hasLast = true;
        return last;
    }
}
