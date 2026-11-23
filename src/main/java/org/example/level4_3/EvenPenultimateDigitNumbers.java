package org.example.level4_3;

public class EvenPenultimateDigitNumbers {
    public void printNumbers() {
        for (int i = 10; i <= 1000; i++) {
            int penultimate = i / 10 % 10;
            if (penultimate % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
