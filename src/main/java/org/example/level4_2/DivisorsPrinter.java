package org.example.level4_2;

public class DivisorsPrinter {
    public void printDivisors(int number) {
        int positiveNumber = Math.abs(number);

        for (int i = 1; i <= positiveNumber; i++) {
            if (positiveNumber % i == 0) {
                System.out.println(i);
            }
        }
    }
}
