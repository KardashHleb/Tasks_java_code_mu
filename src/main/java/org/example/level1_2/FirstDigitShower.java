package org.example.level1_2;

public class FirstDigitShower {
    public char showFirstDigit(int number) {
        int positiveNumber = Math.abs(number);
        String numberAsString = String.valueOf(positiveNumber);
        char firstDigit = numberAsString.charAt(0);
        System.out.println(firstDigit);
        return firstDigit;
    }
}
