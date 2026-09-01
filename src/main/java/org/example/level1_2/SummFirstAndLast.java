package org.example.level1_2;

public class SummFirstAndLast {
    public int sumFirstAndLast(int number) {
        int positiveNumber = Math.abs(number);
        int lastDigit = positiveNumber % 10;
        String numberAsString = String.valueOf(positiveNumber);
        char firstDigitChar = numberAsString.charAt(0);

        if (firstDigitChar >= '0' && firstDigitChar <= '9') {
            int firstDigit = firstDigitChar - '0';
            int sum = firstDigit + lastDigit;
            System.out.println(sum);
            return sum;
        } else {
            System.out.println("Первый символ не цифра");
            return 0;
        }
    }
}
