package org.example.level6_8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendOrWeekday {

    /** Tells whether today is a "weekend" or a "weekday". */
    public String classify() {
        return classify(LocalDate.now());
    }

    /** Tells whether the given "today" date is a "weekend" or a "weekday". */
    public String classify(LocalDate today) {
        DayOfWeek day = today.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY ? "weekend" : "weekday";
    }
}
