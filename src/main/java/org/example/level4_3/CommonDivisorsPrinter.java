package org.example.level4_3;

public class CommonDivisorsPrinter {
    public void printCommon(int num1, int num2) {
        int limit = Math.abs(num1);
        int second = Math.abs(num2);
        if (second < limit) {
            limit = second;
        }

        for (int i = 1; i <= limit; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
            }
        }
    }
}
