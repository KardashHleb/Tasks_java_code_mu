package org.example.level4_6;

public class LastEvenDigit {
    public int find(int number) {
        int positiveNumber = Math.abs(number);

        if (positiveNumber == 0) {
            System.out.println(0);
            return 0;
        }

        while (positiveNumber > 0) {
            int digit = positiveNumber % 10;
            if (digit % 2 == 0) {
                System.out.println(digit);
                return digit;
            }
            positiveNumber = positiveNumber / 10;
        }

        System.out.println("Четная цифра не найдена");
        return -1;
    }
}
