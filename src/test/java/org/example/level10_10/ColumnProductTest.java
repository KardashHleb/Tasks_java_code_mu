package org.example.level10_10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ColumnProductTest {

    private final ColumnProduct task = new ColumnProduct();

    @Test
    void writesColumnLayout() {
        ColumnProduct.Solution solution = task.solve(123, 45);
        assertEquals(5535, solution.product());
        assertEquals(List.of(" 123", "x 45", "----", " 615", "4920", "----", "5535"), solution.lines());
    }

    @Test
    void handlesNegativeOperand() {
        assertEquals(List.of("-12", "x 3", "---", " 36", "---", "-36"), task.solve(-12, 3).lines());
    }

    @ParameterizedTest
    @CsvSource({
            "7, 0, 0",
            "0, 7, 0",
            "-8, -9, 72",
            "2147483647, 2147483647, 4611686014132420609"
    })
    void multiplies(int first, int second, long expected) {
        assertEquals(expected, task.multiply(first, second));
    }
}
