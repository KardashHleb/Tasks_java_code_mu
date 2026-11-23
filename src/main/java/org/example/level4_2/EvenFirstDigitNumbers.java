package org.example.level4_2;

public class EvenFirstDigitNumbers {
    public void printNumbers() {
        for (int i = 10; i <= 1000; i++) {
            int firstDigit = i;
            while (firstDigit >= 10) {
                firstDigit = firstDigit / 10;
            }
            if (firstDigit % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
