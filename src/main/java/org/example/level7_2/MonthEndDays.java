package org.example.level7_2;

import java.time.LocalDate;

public class MonthEndDays {

    /** Returns how many days are left until the end of the current month. */
    public int daysLeft() {
        return daysLeft(LocalDate.now());
    }

    /** Returns how many days are left from {@code today} until the end of its month. */
    public int daysLeft(LocalDate today) {
        return today.lengthOfMonth() - today.getDayOfMonth();
    }
}
