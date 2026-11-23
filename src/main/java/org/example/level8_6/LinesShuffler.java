package org.example.level8_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class LinesShuffler {
    public String[] shuffle(String path) {
        String text = readText(path);
        String[] result = lines(text);
        Random random = new Random();

        for (int i = result.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }

        String joined = "";
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                joined = joined + "\n";
            }
            joined = joined + result[i];
            System.out.println(result[i]);
        }
        writeText(path, joined);
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
            if (text.charAt(i) == '\n') {
                if (index < result.length) {
                    result[index] = line;
                    index = index + 1;
                }
                line = "";
            } else {
                line = line + text.charAt(i);
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
