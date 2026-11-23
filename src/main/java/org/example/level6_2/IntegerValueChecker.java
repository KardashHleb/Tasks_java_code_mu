package org.example.level6_2;

public class IntegerValueChecker {
    public boolean isInteger(String text) {
        System.out.println("Введите целое число");
        System.out.println(text);

        if (text.length() == 0) {
            System.out.println("Не целое число");
            return false;
        }

        int start = 0;
        if (text.charAt(0) == '-') {
            if (text.length() == 1) {
                System.out.println("Не целое число");
                return false;
            }
            start = 1;
        }

        for (int i = start; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current < '0' || current > '9') {
                System.out.println("Не целое число");
                return false;
            }
        }

        System.out.println("Целое число");
        return true;
    }
}
