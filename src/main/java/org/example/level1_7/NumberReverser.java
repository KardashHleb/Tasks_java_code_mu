package org.example.level1_7;

public class NumberReverser {
    public int reverse(int number) {
        int positiveNumber = Math.abs(number);
        int reversed = 0;

        while (positiveNumber > 0) {
            int lastDigit = positiveNumber % 10;
            reversed = reversed * 10 + lastDigit;
            positiveNumber = positiveNumber / 10;
        }

        System.out.println(reversed);
        return reversed;
    }
}
