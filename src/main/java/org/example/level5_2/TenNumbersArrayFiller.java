package org.example.level5_2;

public class TenNumbersArrayFiller {
    public int[] fill(int[] numbers) {
        int[] arr = new int[numbers.length];

        System.out.println("Введите 10 чисел");
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = numbers[i];
            System.out.println(arr[i]);
        }

        return arr;
    }
}
