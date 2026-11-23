package org.example.level10_8;

public class Eratosthenes {
    public int[] primes(int from, int to) {
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
        if (to < 2) {
            return new int[0];
        }

        boolean[] composite = new boolean[to + 1];
        for (int i = 2; i * i <= to; i++) {
            if (!composite[i]) {
                for (int j = i * i; j <= to; j = j + i) {
                    composite[j] = true;
                }
            }
        }

        int start = from;
        if (start < 2) {
            start = 2;
        }
        int count = 0;
        for (int i = start; i <= to; i++) {
            if (!composite[i]) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = start; i <= to; i++) {
            if (!composite[i]) {
                result[index] = i;
                System.out.println(result[index]);
                index = index + 1;
            }
        }
        return result;
    }
}
