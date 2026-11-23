package org.example.level6_6;

import java.time.LocalDate;

public class DaysUntilMonthEnd {
    public int count() {
        LocalDate today = LocalDate.now();
        int result = today.lengthOfMonth() - today.getDayOfMonth();
        System.out.println(result);
        return result;
    }
}
