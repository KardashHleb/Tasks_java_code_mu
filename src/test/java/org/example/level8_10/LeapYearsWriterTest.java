package org.example.level8_10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class LeapYearsWriterTest {

    private final LeapYearsWriter task = new LeapYearsWriter();

    @TempDir
    Path dir;

    @Test
    void writesLeapYearsOfLastCentury() {
        Path file = dir.resolve("leap.txt");
        List<Integer> years = task.write(file, LocalDate.of(2026, 11, 25));
        assertEquals(25, years.size());
        assertEquals(1928, years.get(0));
        assertEquals(2024, years.get(years.size() - 1));
        assertEquals(years.stream().map(String::valueOf).toList(), FileUtils.readLines(file));
    }

    @Test
    void skipsCenturyYearsNotDivisibleBy400() {
        List<Integer> years = task.write(dir.resolve("leap.txt"), LocalDate.of(1950, 1, 1));
        assertFalse(years.contains(1900));
        assertEquals(1852, years.get(0));
        assertEquals(24, years.size());
    }
}
