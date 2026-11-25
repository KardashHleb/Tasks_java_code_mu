package org.example.level5_9;

public class DigitsDoubler {

    /** Doubles every digit of the number: 1234 becomes 11223344 (the sign is kept). */
    public long doubleDigits(int number) {
        long value = Math.abs((long) number);
        if (value >= 1_000_000_000L) {
            throw new IllegalArgumentException("Numbers with more than 9 digits do not fit into a long when doubled");
        }
        long result = 0;
        long place = 1;
        do {
            long digit = value % 10;
            result += digit * 11 * place;
            place *= 100;
            value /= 10;
        } while (value > 0);
        return number < 0 ? -result : result;
    }
}
