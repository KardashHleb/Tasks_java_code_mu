package org.example.level8_5;

import java.nio.file.Path;
import org.example.common.FileUtils;

/** Transliterates Russian Cyrillic text into Latin letters. */
public class CyrillicTransliterator {

    // the 33 lowercase letters of the Russian alphabet and their Latin spelling, position by position
    private static final String CYRILLIC = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String[] LATIN = {
            "a", "b", "v", "g", "d", "e", "yo", "zh", "z", "i",
            "y", "k", "l", "m", "n", "o", "p", "r", "s", "t",
            "u", "f", "h", "ts", "ch", "sh", "sch", "", "y", "",
            "e", "yu", "ya"
    };

    /** Reads the source file, transliterates it and writes the result to the target file. */
    public String transliterate(Path source, Path target) {
        String result = transliterate(FileUtils.readText(source));
        FileUtils.writeText(target, result);
        return result;
    }

    /** Replaces every Cyrillic letter with its Latin spelling, keeping capitalization; other characters are kept. */
    public String transliterate(String text) {
        StringBuilder result = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            result.append(latin(text.charAt(i)));
        }
        return result.toString();
    }

    private String latin(char letter) {
        int index = CYRILLIC.indexOf(Character.toLowerCase(letter));
        if (index < 0) {
            return String.valueOf(letter);
        }
        String value = LATIN[index];
        if (!value.isEmpty() && Character.isUpperCase(letter)) {
            return Character.toUpperCase(value.charAt(0)) + value.substring(1);
        }
        return value;
    }
}
