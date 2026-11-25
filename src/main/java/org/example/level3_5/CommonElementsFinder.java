package org.example.level3_5;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsFinder {

    /** Returns the elements of the first array that also occur in the second one, in the order of the first array. */
    public int[] findCommon(int[] arr1, int[] arr2) {
        Set<Integer> second = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        return Arrays.stream(arr1)
                .filter(second::contains)
                .toArray();
    }
}
