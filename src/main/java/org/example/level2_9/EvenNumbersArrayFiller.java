package org.example.level2_9;

public class EvenNumbersArrayFiller {
    public int[] fill() {
        int[] arr = new int[50];
        int number = 2;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
            System.out.println(arr[i]);
            number = number + 2;
        }

        return arr;
    }
}
