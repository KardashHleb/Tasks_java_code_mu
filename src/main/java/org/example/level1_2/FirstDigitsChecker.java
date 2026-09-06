package org.example.level1_2;

public class FirstDigitsChecker {
    public boolean sameFirstDigits(int number1, int number2) {
        char first1 = firstDigit(number1);
        char first2 = firstDigit(number2);

        if (first1 == first2) {
            System.out.println("Первые цифры совпадают");
            return true;
        } else {
            System.out.println("Первые цифры не совпадают");
            return false;
        }
    }

    private char firstDigit(int number) {
        int positiveNumber = Math.abs(number);
        String numberAsString = String.valueOf(positiveNumber);
        return numberAsString.charAt(0);
    }
}
