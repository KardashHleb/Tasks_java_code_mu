package org.example.level8_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class LuckyTicketsWriterTest {

    @TempDir
    Path dir;

    @Test
    void writesAllLuckyTickets() {
        Path file = dir.resolve("tickets/lucky.txt");
        assertEquals(55_252, new LuckyTicketsWriter().write(file));
        List<String> lines = FileUtils.readLines(file);
        assertEquals(55_252, lines.size());
        assertEquals(List.of("000000", "001001", "001010", "001100"), lines.subList(0, 4));
        assertEquals("999999", lines.get(lines.size() - 1));
    }
}
