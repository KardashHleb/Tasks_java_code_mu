package org.example.level5_1;

public class DuplicateDigitsChecker {
    public boolean hasDuplicateDigits(int num) {
        int positive = Math.abs(num);
        int length = 1;
        int copy = positive;

        while (copy >= 10) {
            length = length + 1;
            copy = copy / 10;
        }

        int[] digits = new int[length];
        int temp = positive;

        for (int i = length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] == digits[j]) {
                    System.out.println("Есть одинаковые цифры");
                    return true;
                }
            }
        }

        System.out.println("Одинаковых цифр нет");
        return false;
    }
}
