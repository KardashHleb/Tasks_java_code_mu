package org.example.level6_4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilNewYear {
    public long count() {
        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.of(today.getYear() + 1, 1, 1);
        long result = ChronoUnit.DAYS.between(today, newYear);

        System.out.println(result);
        return result;
    }
}
