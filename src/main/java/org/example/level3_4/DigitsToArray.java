package org.example.level3_4;

public class DigitsToArray {

    /** Splits the number into its decimal digits, most significant first (the sign is ignored). */
    public byte[] toDigits(int number) {
        int rest = Math.abs(number);
        int count = 0;
        int temp = rest;
        do {
            count++;
            temp = temp / 10;
        } while (temp > 0);

        byte[] digits = new byte[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (byte) (rest % 10);
            rest = rest / 10;
        }
        return digits;
    }
}
