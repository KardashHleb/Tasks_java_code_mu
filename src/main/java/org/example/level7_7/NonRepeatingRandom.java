package org.example.level7_7;

import java.util.Random;

public class NonRepeatingRandom {
    private boolean hasLast = false;
    private int last = 0;

    public int next() {
        Random random = new Random();
        int value = random.nextInt(10) + 1;
        while (hasLast && value == last) {
            value = random.nextInt(10) + 1;
        }

        hasLast = true;
        last = value;
        System.out.println(value);
        return value;
    }
}
