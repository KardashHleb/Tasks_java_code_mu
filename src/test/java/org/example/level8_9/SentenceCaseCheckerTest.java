package org.example.level8_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SentenceCaseCheckerTest {

    private final SentenceCaseChecker task = new SentenceCaseChecker();

    @TempDir
    Path dir;

    @Test
    void checksFile() {
        Path good = dir.resolve("good.txt");
        Path bad = dir.resolve("bad.txt");
        FileUtils.writeText(good, "First one. Second one!\nThird one?");
        FileUtils.writeText(bad, "First one. second one.");
        assertTrue(task.allSentencesCapitalized(good));
        assertFalse(task.allSentencesCapitalized(bad));
    }

    @ParameterizedTest
    @CsvSource({
            "'', true",
            "'\"Yes,\" he said. 2 Cats.', true",
            "'all lower', false",
            "'Fine. 3 cats. no.', false"
    })
    void checksText(String text, boolean expected) {
        assertEquals(expected, task.allSentencesCapitalized(text));
    }
}
