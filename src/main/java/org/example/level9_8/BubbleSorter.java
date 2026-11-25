package org.example.level9_8;

public class BubbleSorter {

    /** Returns a sorted copy of the array using bubble sort (stops early when a pass makes no swaps). */
    public int[] sort(int[] values) {
        int[] result = values.clone();
        for (int end = result.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int j = 0; j < end; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return result;
    }
}
