package org.example.level7_3;

public class PrimeChecker {
    public boolean isPrime(int num) {
        int positive = Math.abs(num);
        if (positive < 2) {
            System.out.println("Не простое");
            return false;
        }

        for (int divisor = 2; divisor * divisor <= positive; divisor++) {
            if (positive % divisor == 0) {
                System.out.println("Не простое");
                return false;
            }
        }

        System.out.println("Простое");
        return true;
    }
}
