package org.example.level4_1;

import java.util.Arrays;

public class ZerosRemover {

    /** Returns a copy of the array without zero elements. */
    public int[] removeZeros(int[] arr) {
        return Arrays.stream(arr)
                .filter(number -> number != 0)
                .toArray();
    }
}
