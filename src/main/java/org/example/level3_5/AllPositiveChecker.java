package org.example.level3_5;

public class AllPositiveChecker {

    /** Checks whether every element of the array is strictly positive (true for an empty array). */
    public boolean allPositive(int[] arr) {
        for (int number : arr) {
            if (number <= 0) {
                return false;
            }
        }
        return true;
    }
}
