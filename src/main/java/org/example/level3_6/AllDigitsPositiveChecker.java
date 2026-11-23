package org.example.level3_6;

public class AllDigitsPositiveChecker {
    public boolean allDigitsPositive(int number) {
        int positiveNumber = Math.abs(number);

        if (positiveNumber == 0) {
            System.out.println("Есть ноль");
            return false;
        }

        while (positiveNumber > 0) {
            if (positiveNumber % 10 == 0) {
                System.out.println("Есть ноль");
                return false;
            }
            positiveNumber = positiveNumber / 10;
        }

        System.out.println("Все цифры больше нуля");
        return true;
    }
}
