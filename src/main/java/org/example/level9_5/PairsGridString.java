package org.example.level9_5;

import java.util.StringJoiner;

public class PairsGridString {

    /** Builds "11 12 13 21 22 23 31 32 33". */
    public String make() {
        return make(3);
    }

    /** Builds all pairs "ij" for i, j from 1 to {@code size}, separated by spaces. */
    public String make(int size) {
        if (size < 1 || size > 9) {
            throw new IllegalArgumentException("Size must be between 1 and 9: " + size);
        }
        StringJoiner result = new StringJoiner(" ");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                result.add(String.valueOf(i) + j);
            }
        }
        return result.toString();
    }
}
