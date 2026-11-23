package org.example.level8_4;

public class LuckyTicketChecker {
    public boolean check(String number) {
        System.out.println("Введите число");
        System.out.println(number);

        boolean digits = number.length() > 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9') {
                digits = false;
            }
        }
        if (!digits || number.length() % 2 != 0) {
            System.out.println(false);
            return false;
        }

        int half = number.length() / 2;
        int left = 0;
        int right = 0;
        for (int i = 0; i < half; i++) {
            left = left + (number.charAt(i) - '0');
            right = right + (number.charAt(half + i) - '0');
        }

        boolean lucky = left == right;
        System.out.println(lucky);
        return lucky;
    }
}
