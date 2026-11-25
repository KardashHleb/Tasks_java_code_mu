package org.example.level4_2;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class AllElementsPresentChecker {

    /** Checks whether every element of the first array also occurs in the second array. */
    public boolean allPresent(int[] arr1, int[] arr2) {
        Set<Integer> second = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        return Arrays.stream(arr1).allMatch(second::contains);
    }
}
