package org.example.level2_10;

public class SixDigitsHalvesChecker {
    public boolean halvesEqual(int number) {
        int positiveNumber = Math.abs(number);
        int firstSum = 0;
        int secondSum = 0;
        int divisor = 100000;

        for (int i = 0; i < 3; i++) {
            firstSum = firstSum + positiveNumber / divisor % 10;
            divisor = divisor / 10;
        }

        for (int i = 0; i < 3; i++) {
            secondSum = secondSum + positiveNumber / divisor % 10;
            divisor = divisor / 10;
        }

        if (firstSum == secondSum) {
            System.out.println("Суммы равны");
            return true;
        }

        System.out.println("Суммы не равны");
        return false;
    }
}
