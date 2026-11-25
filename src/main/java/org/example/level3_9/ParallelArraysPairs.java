package org.example.level3_9;

import java.util.ArrayList;
import java.util.List;

public class ParallelArraysPairs {

    /**
     * Pairs up elements with the same index from two arrays as "a,b" strings.
     * If the arrays differ in length, the extra elements of the longer one are ignored.
     */
    public List<String> toPairs(int[] arr1, int[] arr2) {
        int length = Math.min(arr1.length, arr2.length);
        List<String> pairs = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            pairs.add(arr1[i] + "," + arr2[i]);
        }
        return pairs;
    }
}
