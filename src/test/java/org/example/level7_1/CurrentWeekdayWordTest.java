package org.example.level7_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class CurrentWeekdayWordTest {

    private final CurrentWeekdayWord task = new CurrentWeekdayWord();

    @Test
    void returnsWeekdayOfGivenDay() {
        assertEquals("Wednesday", task.weekday(LocalDate.of(2026, 11, 25)));
    }

    @Test
    void handlesSunday() {
        assertEquals("Sunday", task.weekday(LocalDate.of(2026, 11, 29)));
    }
}
