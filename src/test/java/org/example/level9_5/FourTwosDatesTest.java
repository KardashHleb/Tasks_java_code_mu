package org.example.level9_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class FourTwosDatesTest {

    private final FourTwosDates task = new FourTwosDates();

    @Test
    void everyFoundDateHasExactlyFourTwos() {
        List<String> dates = task.find();
        assertFalse(dates.isEmpty());
        for (String date : dates) {
            assertEquals(4, date.chars().filter(c -> c == '2').count(), date);
        }
    }

    @Test
    void containsKnownDatesAndSkipsOthers() {
        List<String> dates = task.find();
        assertTrue(dates.contains("02.02.2020"));
        assertTrue(dates.contains("02.12.2021"));
        assertFalse(dates.contains("22.02.2022"));
        assertFalse(dates.contains("02.02.2000"));
    }

    @Test
    void rejectsReversedRange() {
        assertThrows(IllegalArgumentException.class, () -> task.find(2010, 2001));
    }
}
