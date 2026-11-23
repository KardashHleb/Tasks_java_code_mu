package org.example.level8_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileLinesReader {
    public String[] read(String path) {
        String text = readText(path);
        String[] result = lines(text);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return result;
    }

    private String[] lines(String text) {
        if (text.length() == 0) {
            return new String[0];
        }

        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                count = count + 1;
            }
        }
        if (text.charAt(text.length() - 1) == '\n') {
            count = count - 1;
        }

        String[] result = new String[count];
        String line = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == '\n') {
                if (index < result.length) {
                    result[index] = line;
                    index = index + 1;
                }
                line = "";
            } else {
                line = line + current;
            }
        }
        if (index < result.length) {
            result[index] = line;
        }
        return result;
    }

    private String readText(String path) {
        String text = "";
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8)) {
            int ch = reader.read();
            while (ch != -1) {
                if (ch != '\r') {
                    text = text + (char) ch;
                }
                ch = reader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return text;
    }
}
