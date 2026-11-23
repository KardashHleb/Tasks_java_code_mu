package org.example.level2_2;

public class ArrayElementsSum {
    public int sumElements(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
        return sum;
    }
}
