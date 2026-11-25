package org.example.level8_2;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class FileLettersCounter {

    /** Returns the number of letters (of any alphabet) in a text file. */
    public int count(Path file) {
        String text = FileUtils.readText(file);
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}
