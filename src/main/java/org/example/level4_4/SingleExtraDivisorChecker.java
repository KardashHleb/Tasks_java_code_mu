package org.example.level4_4;

public class SingleExtraDivisorChecker {
    public boolean hasSingleExtraDivisor(int number) {
        int positiveNumber = Math.abs(number);
        int divisors = 0;

        for (int i = 1; i <= positiveNumber; i++) {
            if (positiveNumber % i == 0) {
                divisors = divisors + 1;
            }
        }

        if (divisors == 3) {
            System.out.println("Один делитель кроме единицы и самого числа");
            return true;
        }

        System.out.println("Условие не выполнено");
        return false;
    }
}
