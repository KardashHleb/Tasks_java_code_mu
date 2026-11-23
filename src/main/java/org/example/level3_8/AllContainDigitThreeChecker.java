package org.example.level3_8;

public class AllContainDigitThreeChecker {
    public boolean allContainThree(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!containsThree(arr[i])) {
                System.out.println("Не все числа содержат 3");
                return false;
            }
        }

        System.out.println("Все числа содержат 3");
        return true;
    }

    private boolean containsThree(int number) {
        int positiveNumber = Math.abs(number);

        if (positiveNumber == 0) {
            return false;
        }

        while (positiveNumber > 0) {
            if (positiveNumber % 10 == 3) {
                return true;
            }
            positiveNumber = positiveNumber / 10;
        }

        return false;
    }
}
