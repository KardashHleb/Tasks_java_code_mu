package org.example.level2_6;

public class EvenArrayElementsShower {
    public void printEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
