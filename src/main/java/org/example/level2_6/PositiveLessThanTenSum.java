package org.example.level2_6;

public class PositiveLessThanTenSum {

    /** Returns the sum of the array elements that are greater than 0 and less than 10. */
    public int sumInRange(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int sum = 0;
        for (int element : arr) {
            if (element > 0 && element < 10) {
                sum += element;
            }
        }
        return sum;
    }
}
