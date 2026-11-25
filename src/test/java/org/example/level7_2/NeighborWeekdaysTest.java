package org.example.level7_2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class NeighborWeekdaysTest {

    private final NeighborWeekdays task = new NeighborWeekdays();

    @Test
    void returnsNeighboursOfMidweekDay() {
        assertArrayEquals(new String[] {"Tue", "Wed", "Thu"}, task.days(LocalDate.of(2026, 11, 25)));
    }

    @Test
    void wrapsAroundWeekBoundaries() {
        assertArrayEquals(new String[] {"Sat", "Sun", "Mon"}, task.days(LocalDate.of(2026, 11, 29)));
        assertArrayEquals(new String[] {"Sun", "Mon", "Tue"}, task.days(LocalDate.of(2026, 11, 30)));
    }
}
