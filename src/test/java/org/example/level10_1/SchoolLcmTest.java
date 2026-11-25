package org.example.level10_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SchoolLcmTest {

    private final SchoolLcm task = new SchoolLcm();

    @Test
    void writesSchoolSteps() {
        SchoolLcm.Solution solution = task.solve(12, 18);
        assertEquals(36, solution.lcm());
        assertEquals(List.of("12 18 | 2", "6 9 | 2", "3 9 | 3", "1 3 | 3", "1 1 |", "LCM = 36"), solution.steps());
    }

    @ParameterizedTest
    @CsvSource({
            "4, 6, 12",
            "7, 13, 91",
            "1, 1, 1",
            "5, 25, 25",
            "2147483647, 2147483646, 4611686011984936962"
    })
    void computesLcm(int first, int second, long expected) {
        assertEquals(expected, task.lcm(first, second));
    }

    @Test
    void rejectsNonPositiveNumbers() {
        assertThrows(IllegalArgumentException.class, () -> task.lcm(0, 5));
        assertThrows(IllegalArgumentException.class, () -> task.lcm(4, -6));
    }
}
