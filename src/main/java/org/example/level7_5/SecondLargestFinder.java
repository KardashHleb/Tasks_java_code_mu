package org.example.level7_5;

public class SecondLargestFinder {
    public int find(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        boolean found = false;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest && (!found || arr[i] > second)) {
                second = arr[i];
                found = true;
            }
        }

        if (!found) {
            second = largest;
        }

        System.out.println(second);
        return second;
    }
}
