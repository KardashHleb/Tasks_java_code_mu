package org.example.level2_9;

public class DayTypeDeterminer {

    /** Returns "Weekday" for days 1-5 and "Weekend" for days 6-7 (1 is Monday). */
    public String determine(int dayOfWeek) {
        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            return "Weekday";
        } else if (dayOfWeek == 6 || dayOfWeek == 7) {
            return "Weekend";
        }
        throw new IllegalArgumentException("Day of week must be between 1 and 7: " + dayOfWeek);
    }
}
