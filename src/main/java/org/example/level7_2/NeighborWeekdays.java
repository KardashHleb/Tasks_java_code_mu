package org.example.level7_2;

import java.time.LocalDate;

public class NeighborWeekdays {

    private static final String[] NAMES = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    /** Returns the short names of yesterday, today and tomorrow. */
    public String[] days() {
        return days(LocalDate.now());
    }

    /** Returns the short names of the day before {@code today}, {@code today} itself and the day after. */
    public String[] days(LocalDate today) {
        int current = today.getDayOfWeek().getValue() - 1;
        int previous = (current + NAMES.length - 1) % NAMES.length;
        int next = (current + 1) % NAMES.length;
        return new String[] {NAMES[previous], NAMES[current], NAMES[next]};
    }
}
