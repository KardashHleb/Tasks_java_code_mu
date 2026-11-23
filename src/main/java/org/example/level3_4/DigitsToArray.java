package org.example.level3_4;

public class DigitsToArray {
    public byte[] toDigits(int number) {
        int positiveNumber = Math.abs(number);
        int temp = positiveNumber;
        int count = 0;

        if (positiveNumber == 0) {
            count = 1;
        }

        while (temp > 0) {
            count = count + 1;
            temp = temp / 10;
        }

        byte[] digits = new byte[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (byte) (positiveNumber % 10);
            positiveNumber = positiveNumber / 10;
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }

        return digits;
    }
}
