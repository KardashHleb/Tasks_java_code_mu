package org.example.level2_1;

public class FactorialFinder {
    public int findFactorial(byte num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return factorial;
    }
}
