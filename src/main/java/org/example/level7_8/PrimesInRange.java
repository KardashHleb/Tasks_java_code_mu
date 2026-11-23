package org.example.level7_8;

public class PrimesInRange {
    public int[] primes(int from, int to) {
        int min = from;
        int max = to;
        if (to < from) {
            min = to;
            max = from;
        }

        int count = 0;
        for (int number = min; number <= max; number++) {
            if (isPrime(number)) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int number = min; number <= max; number++) {
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
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
