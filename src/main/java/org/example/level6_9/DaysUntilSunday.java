package org.example.level6_9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DaysUntilSunday {
    public int count() {
        int today = LocalDate.now().getDayOfWeek().getValue();
        int sunday = DayOfWeek.SUNDAY.getValue();
        int result = sunday - today;
        if (result < 0) {
            result = result + 7;
        }

        System.out.println(result);
        return result;
    }
}
