package org.example.level2_2;

public class FirstAndLastDigitSum {
    public int sumFirstAndLast(int number) {
        int positiveNumber = Math.abs(number);
        int lastDigit = positiveNumber % 10;
        int firstDigit = positiveNumber;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int sum = firstDigit + lastDigit;
        System.out.println(sum);
        return sum;
    }
}
