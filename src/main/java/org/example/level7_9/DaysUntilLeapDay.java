package org.example.level7_9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilLeapDay {
    public long count() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();

        if (isLeap(year)) {
            LocalDate leapDay = LocalDate.of(year, 2, 29);
            if (!today.isAfter(leapDay)) {
                long result = ChronoUnit.DAYS.between(today, leapDay);
                System.out.println(result);
                return result;
            }
        }

        year = year + 1;
        while (!isLeap(year)) {
            year = year + 1;
        }

        long result = ChronoUnit.DAYS.between(today, LocalDate.of(year, 2, 29));
        System.out.println(result);
        return result;
    }

    private boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
