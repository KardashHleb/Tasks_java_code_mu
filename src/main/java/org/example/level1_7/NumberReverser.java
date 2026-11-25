package org.example.level1_7;

public class NumberReverser {

    /** Reverses the digits of the number, keeping its sign (e.g. -123 becomes -321). */
    public long reverse(int number) {
        long rest = Math.abs((long) number);
        long reversed = 0;
        while (rest > 0) {
            reversed = reversed * 10 + rest % 10;
            rest /= 10;
        }
        return number < 0 ? -reversed : reversed;
    }
}
