package org.example.level7_4;

public class EvenDigitsRemover {

    /** Removes all even digits from the number, keeping its sign (for example 123456 -> 135). */
    public int remove(int number) {
        long rest = Math.abs((long) number);
        long result = 0;
        long place = 1;
        while (rest > 0) {
            long digit = rest % 10;
            if (digit % 2 != 0) {
                result += digit * place;
                place *= 10;
            }
            rest /= 10;
        }
        return (int) (number < 0 ? -result : result);
    }
}
