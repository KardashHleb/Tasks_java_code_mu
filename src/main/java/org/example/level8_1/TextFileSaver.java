package org.example.level8_1;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class TextFileSaver {

    /** Saves the text to the file, creating missing parent folders and replacing existing content. */
    public void save(Path file, String text) {
        FileUtils.writeText(file, text);
    }
}
