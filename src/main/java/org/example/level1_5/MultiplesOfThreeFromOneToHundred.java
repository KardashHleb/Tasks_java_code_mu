package org.example.level1_5;

public class MultiplesOfThreeFromOneToHundred {
    public void printMultiplesOfThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
