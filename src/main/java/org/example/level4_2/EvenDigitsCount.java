package org.example.level4_2;

public class EvenDigitsCount {

    /** Counts the even digits of the number (0 counts as even). */
    public int countEvenDigits(int number) {
        int rest = Math.abs(number);
        int count = 0;
        do {
            if (rest % 10 % 2 == 0) {
                count++;
            }
            rest = rest / 10;
        } while (rest > 0);
        return count;
    }
}
