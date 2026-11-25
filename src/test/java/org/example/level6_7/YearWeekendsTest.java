package org.example.level6_7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YearWeekendsTest {

    private final YearWeekends weekends = new YearWeekends();

    @Test
    void listsWeekendsOf2026() {
        List<LocalDate> result = weekends.list(2026);
        assertEquals(104, result.size());
        assertEquals(LocalDate.of(2026, 1, 3), result.get(0));
        assertEquals(LocalDate.of(2026, 1, 4), result.get(1));
        assertEquals(LocalDate.of(2026, 12, 27), result.get(result.size() - 1));
    }

    @Test
    void leapYearStartingOnSaturdayHas106() {
        // 2000 is a leap year that began on Saturday and ended on Sunday
        assertEquals(106, weekends.list(2000).size());
    }
}
