package org.example.level2_5;

public class StringArrayToIntConverter {
    public int[] toIntArray(String[] arr) {
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
            System.out.println(numbers[i]);
        }

        return numbers;
    }
}
