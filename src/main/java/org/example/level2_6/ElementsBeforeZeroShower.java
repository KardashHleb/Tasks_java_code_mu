package org.example.level2_6;

public class ElementsBeforeZeroShower {
    public void printBeforeZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                break;
            }
            System.out.println(arr[i]);
        }
    }
}
