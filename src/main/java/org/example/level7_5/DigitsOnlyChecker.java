package org.example.level7_5;

public class DigitsOnlyChecker {
    public boolean onlyDigits(String text) {
        if (text.length() == 0) {
            System.out.println("Не число");
            return false;
        }

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current < '0' || current > '9') {
                System.out.println("Не число");
                return false;
            }
        }

        System.out.println("Число");
        return true;
    }
}
