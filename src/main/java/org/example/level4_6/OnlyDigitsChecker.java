package org.example.level4_6;

public class OnlyDigitsChecker {
    public boolean onlyDigits(String str) {
        if (str.length() == 0) {
            System.out.println("Есть не цифра");
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current < '0' || current > '9') {
                System.out.println("Есть не цифра");
                return false;
            }
        }

        System.out.println("Только цифры");
        return true;
    }
}
