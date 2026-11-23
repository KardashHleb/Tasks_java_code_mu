package org.example.level4_2;

public class FirstLastDigitSwapper {
    public int swap(int number) {
        int positiveNumber = Math.abs(number);
        int digits = 0;
        int temp = positiveNumber;

        if (positiveNumber == 0) {
            digits = 1;
        }

        while (temp > 0) {
            digits = digits + 1;
            temp = temp / 10;
        }

        int divisor = 1;
        for (int i = 1; i < digits; i++) {
            divisor = divisor * 10;
        }

        int first = positiveNumber / divisor;
        int last = positiveNumber % 10;
        int middle = positiveNumber % divisor / 10;
        int result = last * divisor + middle * 10 + first;

        System.out.println(result);
        return result;
    }
}
