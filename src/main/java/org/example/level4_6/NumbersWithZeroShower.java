package org.example.level4_6;

public class NumbersWithZeroShower {
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (containsZero(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }

    private boolean containsZero(int number) {
        int positiveNumber = Math.abs(number);
        if (positiveNumber == 0) {
            return true;
        }
        while (positiveNumber > 0) {
            if (positiveNumber % 10 == 0) {
                return true;
            }
            positiveNumber = positiveNumber / 10;
        }
        return false;
    }
}
