package org.example.level8_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class SubfolderNamesReaderTest {

    private final SubfolderNamesReader task = new SubfolderNamesReader();

    @TempDir
    Path dir;

    @Test
    void listsDirectSubfoldersOnly() throws Exception {
        Files.createDirectories(dir.resolve("beta/nested"));
        Files.createDirectories(dir.resolve("alpha"));
        FileUtils.writeText(dir.resolve("file.txt"), "");
        assertEquals(List.of("alpha", "beta"), task.names(dir));
    }

    @Test
    void folderWithoutSubfoldersGivesEmptyList() {
        FileUtils.writeText(dir.resolve("file.txt"), "");
        assertEquals(List.of(), task.names(dir));
    }

    @Test
    void missingFolderThrows() {
        assertThrows(IllegalArgumentException.class, () -> task.names(dir.resolve("missing")));
    }
}
