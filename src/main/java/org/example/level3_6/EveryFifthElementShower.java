package org.example.level3_6;

public class EveryFifthElementShower {
    public void printEveryFifth(int[] arr) {
        for (int i = 4; i < arr.length; i = i + 5) {
            System.out.println(arr[i]);
        }
    }
}
