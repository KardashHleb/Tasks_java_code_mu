package org.example.level3_9;

import java.util.stream.IntStream;

public class AllZeroPositions {

    /** Returns the indexes of all '0' characters in the string. */
    public int[] findZeroPositions(String str) {
        return IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == '0')
                .toArray();
    }
}
