package org.example.level2_1;

import java.util.StringJoiner;

public class ArrayElementsFormatter {

    /** Returns the array elements as a single line separated by ", ". */
    public String format(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        StringJoiner joiner = new StringJoiner(", ");
        for (int element : arr) {
            joiner.add(String.valueOf(element));
        }
        return joiner.toString();
    }
}
