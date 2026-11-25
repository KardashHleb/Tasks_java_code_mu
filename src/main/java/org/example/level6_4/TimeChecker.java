package org.example.level6_4;

public class TimeChecker {

    /** Checks whether the text is a correct time in the format hh:mm:ss. */
    public boolean isCorrect(String time) {
        if (time.length() != 8 || time.charAt(2) != ':' || time.charAt(5) != ':') {
            return false;
        }
        return inRange(time, 0, 23) && inRange(time, 3, 59) && inRange(time, 6, 59);
    }

    private boolean inRange(String text, int start, int max) {
        char tens = text.charAt(start);
        char ones = text.charAt(start + 1);
        if (tens < '0' || tens > '9' || ones < '0' || ones > '9') {
            return false;
        }
        int value = (tens - '0') * 10 + (ones - '0');
        return value <= max;
    }
}
