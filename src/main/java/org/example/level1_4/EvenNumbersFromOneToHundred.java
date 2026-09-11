package org.example.level1_4;

public class EvenNumbersFromOneToHundred {
    public void printEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
