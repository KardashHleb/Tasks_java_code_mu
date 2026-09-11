package org.example.level1_7;

public class OddSumFromOneToHundred {
    public int calculateOddSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
