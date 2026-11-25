package org.example.level2_2;

public class FirstAndLastDigitSum {

    /** Returns the sum of the first and the last digit of the number, found arithmetically. */
    public int sumFirstAndLast(int number) {
        long rest = Math.abs((long) number);
        int lastDigit = (int) (rest % 10);
        while (rest >= 10) {
            rest /= 10;
        }
        return (int) rest + lastDigit;
    }
}
