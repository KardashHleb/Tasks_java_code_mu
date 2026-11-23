package org.example.level3_4;

public class AllDigitsOddChecker {
    public boolean allDigitsOdd(int number) {
        int positiveNumber = Math.abs(number);

        if (positiveNumber == 0) {
            System.out.println("Есть четная цифра");
            return false;
        }

        while (positiveNumber > 0) {
            int digit = positiveNumber % 10;
            if (digit % 2 == 0) {
                System.out.println("Есть четная цифра");
                return false;
            }
            positiveNumber = positiveNumber / 10;
        }

        System.out.println("Все цифры нечетные");
        return true;
    }
}
