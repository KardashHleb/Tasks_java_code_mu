package org.example.level4_1;

public class FirstDigitPosition {
    public int findFirstDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current >= '0' && current <= '9') {
                System.out.println(i);
                return i;
            }
        }

        System.out.println("Цифра не найдена");
        return -1;
    }
}
