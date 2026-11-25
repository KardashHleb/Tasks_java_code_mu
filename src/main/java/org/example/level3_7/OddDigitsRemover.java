package org.example.level3_7;

public class OddDigitsRemover {

    /** Removes all odd digits from the number, keeping the sign, e.g. 123456 gives 246. */
    public int removeOddDigits(int number) {
        int rest = Math.abs(number);
        int result = 0;
        int position = 1;
        while (rest > 0) {
            int digit = rest % 10;
            if (digit % 2 == 0) {
                result = result + digit * position;
                position = position * 10;
            }
            rest = rest / 10;
        }
        return number < 0 ? -result : result;
    }
}
