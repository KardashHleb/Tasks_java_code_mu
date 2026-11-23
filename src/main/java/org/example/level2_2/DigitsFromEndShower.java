package org.example.level2_2;

public class DigitsFromEndShower {
    public void showDigitsFromEnd(int number) {
        int positiveNumber = Math.abs(number);

        if (positiveNumber == 0) {
            System.out.println(0);
            return;
        }

        while (positiveNumber > 0) {
            int lastDigit = positiveNumber % 10;
            System.out.println(lastDigit);
            positiveNumber = positiveNumber / 10;
        }
    }
}
