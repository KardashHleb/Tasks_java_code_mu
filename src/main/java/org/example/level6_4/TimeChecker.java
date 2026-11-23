package org.example.level6_4;

public class TimeChecker {
    public boolean isCorrect(String time) {
        String hours = "";
        String minutes = "";
        String seconds = "";
        int part = 0;

        for (int i = 0; i < time.length(); i++) {
            char current = time.charAt(i);
            if (current == ':') {
                part = part + 1;
                if (part > 2) {
                    System.out.println("Время некорректно");
                    return false;
                }
            } else if (part == 0) {
                hours = hours + current;
            } else if (part == 1) {
                minutes = minutes + current;
            } else {
                seconds = seconds + current;
            }
        }

        if (part != 2 || !inRange(hours, 0, 23) || !inRange(minutes, 0, 59) || !inRange(seconds, 0, 59)) {
            System.out.println("Время некорректно");
            return false;
        }

        System.out.println("Время корректно");
        return true;
    }

    private boolean inRange(String text, int min, int max) {
        if (text.length() != 2) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current < '0' || current > '9') {
                return false;
            }
        }
        int value = (text.charAt(0) - '0') * 10 + (text.charAt(1) - '0');
        return value >= min && value <= max;
    }
}
