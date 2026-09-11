package org.example.level1_6;

public class DigitCharsSummer {
    public int sumDigitChars(char chr1, char chr2, char chr3) {
        int number1 = chr1 - '0';
        int number2 = chr2 - '0';
        int number3 = chr3 - '0';
        int sum = number1 + number2 + number3;
        System.out.println(sum);
        return sum;
    }
}
