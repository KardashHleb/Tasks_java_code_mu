package org.example.level3_8;

public class AllContainDigitThreeChecker {

    /** Checks whether every number of the array contains the digit 3 (true for an empty array). */
    public boolean allContainThree(int[] arr) {
        for (int number : arr) {
            if (!containsThree(number)) {
                return false;
            }
        }
        return true;
    }

    private boolean containsThree(int number) {
        int rest = Math.abs(number);
        while (rest > 0) {
            if (rest % 10 == 3) {
                return true;
            }
            rest = rest / 10;
        }
        return false;
    }
}
