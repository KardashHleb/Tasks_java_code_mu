package org.example.level6_10;

public class ConsecutiveEqualsChecker {

    /** Checks whether the array contains two equal elements next to each other. */
    public boolean hasConsecutiveEquals(int[] numbers) {
        for (int i = 0; i + 1 < numbers.length; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
