package org.example.level4_7;

public class ContainsDigitThreeChecker {
    public boolean contains(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int positiveNumber = Math.abs(arr[i]);
            while (positiveNumber > 0) {
                if (positiveNumber % 10 == 3) {
                    System.out.println("Есть число с цифрой 3");
                    return true;
                }
                positiveNumber = positiveNumber / 10;
            }
        }

        System.out.println("Нет числа с цифрой 3");
        return false;
    }
}
