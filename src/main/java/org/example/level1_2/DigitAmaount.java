package org.example.level1_2;

public class DigitAmaount {
    public int countDigits(int number) {
        int positiveNumber = Math.abs(number);
        String numberAsString = String.valueOf(positiveNumber);
        int count = numberAsString.length();
        System.out.println(count);
        return count;
    }
}
