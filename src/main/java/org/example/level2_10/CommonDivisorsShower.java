package org.example.level2_10;

public class CommonDivisorsShower {
    public void printCommonDivisors(int num1, int num2) {
        int limit = num1;
        if (num2 < limit) {
            limit = num2;
        }

        for (int i = 1; i <= limit; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
            }
        }
    }
}
