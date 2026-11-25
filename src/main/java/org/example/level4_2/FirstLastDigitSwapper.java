package org.example.level4_2;

public class FirstLastDigitSwapper {

    /**
     * Swaps the first and the last digit of the number, keeping the sign, e.g. 12345 gives 52341.
     * A leading zero produced by the swap disappears (120 gives 21).
     */
    public int swap(int number) {
        int value = Math.abs(number);
        if (value < 10) {
            return number;
        }
        int divisor = 1;
        while (value / divisor >= 10) {
            divisor = divisor * 10;
        }
        int first = value / divisor;
        int last = value % 10;
        int middle = value % divisor / 10;
        int result = last * divisor + middle * 10 + first;
        return number < 0 ? -result : result;
    }
}
