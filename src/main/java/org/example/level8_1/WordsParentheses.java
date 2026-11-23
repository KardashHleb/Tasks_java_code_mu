package org.example.level8_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class WordsParentheses {
    public String wrap(String source, String target) {
        String text = readText(source);
        String result = "";
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == ' ' || current == '\n' || current == '\t') {
                if (word.length() > 0) {
                    result = result + "(" + word + ")";
                    word = "";
                }
                result = result + current;
            } else {
                word = word + current;
            }
        }
        if (word.length() > 0) {
            result = result + "(" + word + ")";
        }

        writeText(target, result);
        System.out.println(result);
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

    private void writeText(String path, String text) {
        try {
            File file = new File(path);
            File parent = file.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
                writer.write(text);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
