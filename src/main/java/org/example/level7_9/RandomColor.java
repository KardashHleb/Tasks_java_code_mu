package org.example.level7_9;

import java.util.Random;

public class RandomColor {

    private static final String HEX_DIGITS = "0123456789abcdef";

    /** Returns a random color in the #rrggbb hex format. */
    public String color() {
        return color(new Random());
    }

    /** Same as {@link #color()} with a caller-supplied random generator. */
    public String color(Random random) {
        StringBuilder result = new StringBuilder("#");
        for (int i = 0; i < 6; i++) {
            result.append(HEX_DIGITS.charAt(random.nextInt(HEX_DIGITS.length())));
        }
        return result.toString();
    }
}
