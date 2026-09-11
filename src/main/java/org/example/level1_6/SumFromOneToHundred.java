package org.example.level1_6;

public class SumFromOneToHundred {
    public int calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }
}
