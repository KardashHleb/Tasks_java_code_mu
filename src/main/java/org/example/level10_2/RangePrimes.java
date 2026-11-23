package org.example.level10_2;

public class RangePrimes {
    public int[] primes(int from, int to) {
        System.out.println("Введите два целых числа");
        System.out.println(from);
        System.out.println(to);

        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
        if (to < 2) {
            return new int[0];
        }

        int start = from;
        if (start < 2) {
            start = 2;
        }
        int count = 0;
        for (int number = start; number <= to; number++) {
            if (isPrime(number)) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int number = start; number <= to; number++) {
            if (isPrime(number)) {
                result[index] = number;
                System.out.println(result[index]);
                index = index + 1;
            }
        }
        return result;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
