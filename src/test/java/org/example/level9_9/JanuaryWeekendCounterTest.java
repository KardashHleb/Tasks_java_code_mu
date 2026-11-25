package org.example.level9_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class JanuaryWeekendCounterTest {

    private final JanuaryWeekendCounter task = new JanuaryWeekendCounter();

    @Test
    void findsYearsStartingOnWeekend() {
        assertEquals(List.of(2000, 2005, 2006, 2011, 2012, 2017, 2022, 2023), task.years(2000, 2026));
        assertEquals(8, task.count(2000, 2026));
    }

    @Test
    void singleYearRange() {
        assertEquals(0, task.count(2026, 2026));
    }

    @Test
    void rejectsReversedRange() {
        assertThrows(IllegalArgumentException.class, () -> task.years(2026, 2000));
    }
}
