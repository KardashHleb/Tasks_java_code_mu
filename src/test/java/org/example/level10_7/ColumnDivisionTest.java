package org.example.level10_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ColumnDivisionTest {

    private final ColumnDivision task = new ColumnDivision();

    @Test
    void writesLongDivisionSteps() {
        ColumnDivision.Solution solution = task.solve(1234, 5);
        assertEquals(246, solution.quotient());
        assertEquals(4, solution.remainder());
        assertEquals(List.of("1234 | 5", "12 - 10 = 2", "23 - 20 = 3", "34 - 30 = 4", "quotient = 246", "remainder = 4"),
                solution.steps());
    }

    @ParameterizedTest
    @CsvSource({
            "1005, 5, 201, 0",
            "3, 5, 0, 3",
            "-7, 2, -3, -1",
            "7, -2, -3, 1",
            "0, 9, 0, 0",
            "-2147483648, -1, 2147483648, 0"
    })
    void matchesJavaDivision(int dividend, int divisor, long quotient, long remainder) {
        ColumnDivision.Solution solution = task.solve(dividend, divisor);
        assertEquals(quotient, solution.quotient());
        assertEquals(remainder, solution.remainder());
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> task.divide(5, 0));
    }
}
