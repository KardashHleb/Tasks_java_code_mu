package org.example.level1_10;

public class DivisorsShower {
    public void printDivisors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
