package org.example.level1_7;

public class PowersOfTwoShower {
    public void printPowersOfTwo(int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power = power * 2;
            System.out.println(power);
        }
    }
}
