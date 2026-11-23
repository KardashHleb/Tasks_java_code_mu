package org.example.level3_3;

public class ContainsZeroChecker {
    public boolean containsZero(int number) {
        int positiveNumber = Math.abs(number);

        if (positiveNumber == 0) {
            System.out.println("Содержит ноль");
            return true;
        }

        while (positiveNumber > 0) {
            if (positiveNumber % 10 == 0) {
                System.out.println("Содержит ноль");
                return true;
            }
            positiveNumber = positiveNumber / 10;
        }

        System.out.println("Не содержит ноль");
        return false;
    }
}
