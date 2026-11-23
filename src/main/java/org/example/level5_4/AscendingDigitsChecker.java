package org.example.level5_4;

public class AscendingDigitsChecker {
    public boolean isAscending(int num) {
        int positive = Math.abs(num);
        int previous = -1;
        int temp = positive;
        int length = 1;

        while (temp >= 10) {
            length = length + 1;
            temp = temp / 10;
        }

        int divisor = 1;
        for (int i = 1; i < length; i++) {
            divisor = divisor * 10;
        }

        temp = positive;
        for (int i = 0; i < length; i++) {
            int digit = temp / divisor;
            temp = temp % divisor;
            if (divisor > 1) {
                divisor = divisor / 10;
            }
            if (digit <= previous) {
                System.out.println("Цифры не по возрастанию");
                return false;
            }
            previous = digit;
        }

        System.out.println("Цифры по возрастанию");
        return true;
    }
}
