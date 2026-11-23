package org.example.level4_2;

public class EvenDigitsCount {
    public int countEvenDigits(int number) {
        int positiveNumber = Math.abs(number);
        int count = 0;

        if (positiveNumber == 0) {
            count = 1;
        }

        while (positiveNumber > 0) {
            if (positiveNumber % 10 % 2 == 0) {
                count = count + 1;
            }
            positiveNumber = positiveNumber / 10;
        }

        System.out.println(count);
        return count;
    }
}
