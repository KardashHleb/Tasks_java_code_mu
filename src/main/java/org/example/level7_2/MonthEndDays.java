package org.example.level7_2;

import java.time.LocalDate;

public class MonthEndDays {
    public int count() {
        LocalDate today = LocalDate.now();
        int result = today.lengthOfMonth() - today.getDayOfMonth();
        System.out.println(result);
        return result;
    }
}
