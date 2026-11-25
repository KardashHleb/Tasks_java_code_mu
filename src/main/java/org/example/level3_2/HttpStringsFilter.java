package org.example.level3_2;

import java.util.Arrays;

public class HttpStringsFilter {

    private static final String PREFIX = "http://";

    /** Returns the strings that start with "http://". */
    public String[] filter(String[] arr) {
        return Arrays.stream(arr)
                .filter(str -> str.startsWith(PREFIX))
                .toArray(String[]::new);
    }
}
