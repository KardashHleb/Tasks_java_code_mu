package org.example.level8_3;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.example.common.FileUtils;

public class ArrayLineWriter {

    /** Writes every element of the array on its own line of the file and returns the written text. */
    public String write(int[] values, Path file) {
        String text = Arrays.stream(values)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("\n"));
        FileUtils.writeText(file, text);
        return text;
    }
}
