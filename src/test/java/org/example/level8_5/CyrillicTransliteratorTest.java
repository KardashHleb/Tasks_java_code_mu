package org.example.level8_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class CyrillicTransliteratorTest {

    private final CyrillicTransliterator task = new CyrillicTransliterator();

    @TempDir
    Path dir;

    @Test
    void transliteratesFile() {
        Path source = dir.resolve("cyrillic.txt");
        Path target = dir.resolve("latin.txt");
        FileUtils.writeText(source, "Привет, мир!\nЩука");
        assertEquals("Privet, mir!\nSchuka", task.transliterate(source, target));
        assertEquals("Privet, mir!\nSchuka", FileUtils.readText(target));
    }

    @Test
    void dropsSignsAndHandlesMultiLetterSounds() {
        assertEquals("obekt", task.transliterate("объект"));
        assertEquals("Yozh i zhuk", task.transliterate("Ёж и жук"));
    }

    @Test
    void keepsLatinTextAndEmptyText() {
        assertEquals("Hello 123", task.transliterate("Hello 123"));
        assertEquals("", task.transliterate(""));
    }
}
