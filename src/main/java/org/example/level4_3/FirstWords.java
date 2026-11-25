package org.example.level4_3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstWords {

    /** Returns the first {@code count} words of the string joined by single spaces. */
    public String takeFirst(String str, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Word count must not be negative: " + count);
        }
        return Arrays.stream(str.trim().split(" +"))
                .filter(word -> !word.isEmpty())
                .limit(count)
                .collect(Collectors.joining(" "));
    }
}
