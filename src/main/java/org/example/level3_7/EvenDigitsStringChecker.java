package org.example.level3_7;

public class EvenDigitsStringChecker {
    public boolean onlyEvenDigits(String str) {
        if (str.length() == 0) {
            System.out.println("Есть нечетная цифра");
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current < '0' || current > '9' || (current - '0') % 2 != 0) {
                System.out.println("Есть нечетная цифра");
                return false;
            }
        }

        System.out.println("Только четные цифры");
        return true;
    }
}
