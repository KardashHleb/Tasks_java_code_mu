package org.example.level7_5;

public class FibonacciSum {
    public long sumFirst(int count) {
        long result = 0;
        long previous = 0;
        long current = 1;

        for (int i = 1; i <= count; i++) {
            long next = previous + current;
            previous = current;
            current = next;
            result = result + previous;
        }

        System.out.println(result);
        return result;
    }
}
