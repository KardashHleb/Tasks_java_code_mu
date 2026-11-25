package org.example.level6_6;

import java.time.LocalDate;

public class DaysUntilMonthEnd {

    /** Returns the number of days left until the end of the current month. */
    public int count() {
        return count(LocalDate.now());
    }

    /** Returns the number of days from the given "today" date until the last day of its month. */
    public int count(LocalDate today) {
        return today.lengthOfMonth() - today.getDayOfMonth();
    }
}
