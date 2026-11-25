package org.example.level4_7;

public class ContainsDigitThreeChecker {

    /** Checks whether at least one number of the array contains the digit 3. */
    public boolean anyContainsThree(int[] arr) {
        for (int number : arr) {
            int rest = Math.abs(number);
            while (rest > 0) {
                if (rest % 10 == 3) {
                    return true;
                }
                rest = rest / 10;
            }
        }
        return false;
    }
}
