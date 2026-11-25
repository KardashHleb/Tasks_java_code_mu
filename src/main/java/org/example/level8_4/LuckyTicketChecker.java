package org.example.level8_4;

public class LuckyTicketChecker {

    /** Returns true if the digit sum of the first half of the ticket number equals that of the second half. */
    public boolean isLucky(String number) {
        if (number.isEmpty() || number.length() % 2 != 0) {
            throw new IllegalArgumentException("Ticket number must have an even, non-zero number of digits: " + number);
        }
        int half = number.length() / 2;
        int left = 0;
        int right = 0;
        for (int i = 0; i < half; i++) {
            left += digit(number, i);
            right += digit(number, half + i);
        }
        return left == right;
    }

    private int digit(String number, int index) {
        char current = number.charAt(index);
        if (current < '0' || current > '9') {
            throw new IllegalArgumentException("Ticket number must contain digits only: " + number);
        }
        return current - '0';
    }
}
