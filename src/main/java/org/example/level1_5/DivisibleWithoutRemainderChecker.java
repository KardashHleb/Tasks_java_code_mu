package org.example.level1_5;

public class DivisibleWithoutRemainderChecker {
    public boolean dividesWithoutRemainder(int first, int second) {
        if (first % second == 0) {
            System.out.println("Первое число делится на второе без остатка");
            return true;
        } else {
            System.out.println("Первое число делится на второе с остатком");
            return false;
        }
    }
}
