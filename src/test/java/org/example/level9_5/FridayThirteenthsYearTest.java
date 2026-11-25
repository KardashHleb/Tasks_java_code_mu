package org.example.level9_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;

class FridayThirteenthsYearTest {

    private final FridayThirteenthsYear task = new FridayThirteenthsYear();

    @Test
    void findsAllFridaysThe13th() {
        assertEquals(
                List.of(LocalDate.of(2026, 2, 13), LocalDate.of(2026, 3, 13), LocalDate.of(2026, 11, 13)),
                task.find(2026));
    }

    @Test
    void countsYearWithSingleFriday13th() {
        assertEquals(1, task.count(2022));
    }
}
